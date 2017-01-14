package nsoushi.selenide.spec.features.auth

import com.codeborne.selenide.Condition.enabled
import io.kotlintest.specs.BehaviorSpec
import nsoushi.selenide.spec.fixtures.auth.AuthCodeFixture
import nsoushi.selenide.spec.operators.auth.AuthCodeOperator
import nsoushi.selenide.spec.pages.auth.AuthCodePage
import nsoushi.selenide.spec.pages.program.ProgramPage
import org.openqa.selenium.WebDriver

/**
 *
 * @author nsoushi
 */
class AuthCodeSpec : BehaviorSpec() {

    lateinit var targetPage: AuthCodePage
    lateinit var operator: AuthCodeOperator

    companion object {
        const val targetUrl: String = "https://freshlive.tv/auth/code"
    }

    override fun beforeEach() {
        targetPage = AuthCodePage()
        operator = AuthCodeOperator()
    }

    init {

        given("GET: $targetUrl") {
            `when`("非ログイン状態で認証ページを表示する") {

                then("画面構成に必要なモジュールがある") {

                    // 認証ページへアクセス
                    targetPage.open(targetUrl, null)

                    // 認証フォームモジュールがあるか
                    targetPage.getCodeBodyElement().`is`(enabled) shouldBe true
                }
            }

            `when`("非ログイン状態で認証ページに遷移して認証コードを入力する") {

                then("ログインができる") {

                    // fixture
                    val authCode = AuthCodeFixture()
                    // 認証ページへアクセス
                    val driver = targetPage.open(targetUrl, null)
                    // 認証コードの入力
                    operator.auth(targetPage, authCode.code)
                    // トップへアクセス
                    targetPage.open(driver, "https://freshlive.tv/", null)
                }
            }

        }
    }
}

