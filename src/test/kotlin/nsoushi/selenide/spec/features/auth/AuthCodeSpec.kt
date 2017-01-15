package nsoushi.selenide.spec.features.auth

import com.codeborne.selenide.Configuration
import com.codeborne.selenide.WebDriverRunner
import io.kotlintest.specs.BehaviorSpec
import nsoushi.selenide.spec.fixtures.auth.AuthCodeFixture
import nsoushi.selenide.spec.pages.auth.AuthCodePage

/**
 *
 * @author nsoushi
 */
class AuthCodeSpec : BehaviorSpec() {

    lateinit var targetPage: AuthCodePage

    companion object {
        const val targetUrl: String = "https://freshlive.tv/auth/code"
    }

    override fun beforeEach() {
        targetPage = AuthCodePage()

        Configuration.browser = WebDriverRunner.CHROME;
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe")
    }

    init {

        given("GET: $targetUrl") {
            `when`("非ログイン状態で認証ページを表示する") {

                then("画面構成に必要なモジュールがある") {

                    // 認証ページへアクセス
                    val driver = targetPage.open(targetUrl, null)
                    // スクリーンショットを保存
                    targetPage.storeImageToFs(targetPage.takeScreenshot(driver), "./screenshots/auth_code.png")
                    // 認証フォームモジュールがあるか
                    targetPage.hasCodeBodyModule() shouldBe true
                }
            }

            `when`("非ログイン状態で認証ページに遷移して認証コードを入力する") {

                then("ログインができる") {

                    // fixture
                    val authCode = AuthCodeFixture("test_code:xxxxx")
                    // 認証ページへアクセス
                    val driver = targetPage.open(targetUrl, null)
                    // 認証コードの入力
                    targetPage.executeAuth(authCode.code)
                    // トップへアクセス
                    targetPage.open(driver, "https://freshlive.tv/", null)
                }
            }
        }
    }
}

