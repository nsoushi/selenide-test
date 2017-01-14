package nsoushi.selenide.spec.features.program

import com.codeborne.selenide.Condition.*
import com.codeborne.selenide.Configuration
import com.codeborne.selenide.WebDriverRunner
import io.kotlintest.specs.BehaviorSpec
import nsoushi.selenide.spec.features.auth.AuthCodeSpec
import nsoushi.selenide.spec.fixtures.auth.AuthCodeFixture
import nsoushi.selenide.spec.operators.auth.AuthCodeOperator
import nsoushi.selenide.spec.operators.program.ProgramOperator
import nsoushi.selenide.spec.pages.auth.AuthCodePage
import nsoushi.selenide.spec.pages.program.ProgramPage
import org.openqa.selenium.WebDriver

/**
 *
 * @author nsoushi
 */
class ProgramSpec : BehaviorSpec() {

    lateinit var targetPage: ProgramPage
    lateinit var operator: ProgramOperator

    companion object {
        const val channelCode = "sibchtv"
        const val programId = 988
        const val targetUrl: String = "https://freshlive.tv/$channelCode/$programId"
    }

    override fun beforeEach() {
        targetPage = ProgramPage()
        operator = ProgramOperator()

        Configuration.browser = WebDriverRunner.CHROME;
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe")
    }

    init {
        given("GET: $targetUrl") {
            `when`("非ログイン状態で番組ページへ遷移する") {

                then("画面構成に必要なモジュールがある", {

                    // 番組ページへアクセス
                    val driver = targetPage.open(targetUrl, null)
                    // スクリーンショットを保存
                    targetPage.storeImageToFs(targetPage.takeScreenshot(driver), "./screenshots/program.png")
                    // プレイヤーモジュールがあるか
                    targetPage.getPlayerElement().`is`(enabled) shouldBe true
                    // ヘッダーモジュールがあるか
                    targetPage.getHeaderElement().`is`(enabled) shouldBe true
                })
            }

            `when`("ログイン状態で番組ページへ遷移する") {

                then("フォローができる／フォローを解除できる") {
                    // ログインする
                    val authCode = "1234567789012"
                    val driver = login(authCode)
                    // 番組ページへアクセス
                    targetPage.open(driver, targetUrl, null)

                    // フォローする
                    operator.follow(targetPage)
                    // フォローできているか
                    targetPage.getHeaderModule().isFollowing() shouldBe true

                    // フォローを解除する
                    operator.follow(targetPage)
                    // フォローを解除できているか
                    targetPage.getHeaderModule().isFollowing() shouldBe false
                }
            }
        }
    }

    private fun login(code: String): WebDriver {

        val authCodePage = AuthCodePage()
        val authCodeOperator = AuthCodeOperator()

        // fixture
        val authCode = AuthCodeFixture(code)
        // 認証ページへアクセス
        val driver = authCodePage.open(AuthCodeSpec.targetUrl, null)
        // 認証コードの入力
        authCodeOperator.auth(authCodePage, authCode.code)

        return driver
    }
}
