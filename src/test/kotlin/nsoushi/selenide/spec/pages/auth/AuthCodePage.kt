package nsoushi.selenide.spec.pages.auth

import com.codeborne.selenide.Condition.enabled
import nsoushi.selenide.spec.modules.auth.AuthCodeBodyModule
import nsoushi.selenide.spec.operators.auth.AuthCodeOperatorImpl

/**
 * 認証ページにあるモジュールの要素を扱うPageクラス
 *
 * @author nsoushi
 */
class AuthCodePage : AuthCodePageBase(AuthCodeOperatorImpl(), AuthCodeBodyModule()) {

    /**
     * 認証コード入力要素の取得
     */
    fun hasCodeBodyModule() = codeBodyModule().getElement().`is`(enabled)

    /**
     * 認証コードを入力して認証する
     */
    fun executeAuth(code: String) = auth(code)
}