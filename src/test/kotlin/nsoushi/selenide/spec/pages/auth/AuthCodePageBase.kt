package nsoushi.selenide.spec.pages.auth

import com.codeborne.selenide.SelenideElement
import nsoushi.selenide.spec.modules.auth.AuthCodeBodyModule
import nsoushi.selenide.spec.pages.Page
import nsoushi.selenide.spec.pages.PageBase
import nsoushi.selenide.spec.support.ScreenshotSupportImpl

/**
 *  認証ページにあるモジュールの要素を扱うPage抽象クラス
 *
 * @author nsoushi
 */
abstract class AuthCodePageBase constructor(
        private val authCodeBodyModule: AuthCodeBodyModule) : PageBase(ScreenshotSupportImpl()) {

    /**
     * 認証コード入力モジュールの取得
     */
    protected fun codeBodyModule(): AuthCodeBodyModule {
        return authCodeBodyModule
    }
}
