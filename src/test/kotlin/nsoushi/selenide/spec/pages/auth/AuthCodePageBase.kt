package nsoushi.selenide.spec.pages.auth

import nsoushi.selenide.spec.modules.auth.AuthCodeBodyModule
import nsoushi.selenide.spec.operators.auth.AuthCodeOperatorBase
import nsoushi.selenide.spec.pages.PageBase
import nsoushi.selenide.spec.support.ScreenshotSupportImpl

/**
 *  認証ページにあるモジュールの要素を扱うPage抽象クラス
 *
 * @author nsoushi
 */
abstract class AuthCodePageBase constructor(
        private val authCodeOperator: AuthCodeOperatorBase,
        private val authCodeBodyModule: AuthCodeBodyModule
) : PageBase(ScreenshotSupportImpl()), AuthCodeOperatorBase by authCodeOperator {

    /**
     * 認証コード入力モジュールの取得
     */
    protected fun codeBodyModule(): AuthCodeBodyModule {
        return authCodeBodyModule
    }

    /**
     * 認証コードを入力して認証する
     */
    protected fun auth(code: String) {
        authCodeOperator.input(authCodeBodyModule, code)
        authCodeOperator.submit(authCodeBodyModule)
    }
}
