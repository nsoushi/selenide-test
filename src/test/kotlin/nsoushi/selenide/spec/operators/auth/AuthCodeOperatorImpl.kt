package nsoushi.selenide.spec.operators.auth

import nsoushi.selenide.spec.modules.auth.AuthCodeBodyModule

/**
 * 認証コード／オペレータークラス
 *
 * @author nsoushi
 */
class AuthCodeOperatorImpl : AuthCodeOperatorBase {

    override fun input(module: AuthCodeBodyModule, code: String) {
        // 認証コードのinputフィールドに認証コードを入力
        module.setAuthCodeInputValue(code)
    }

    override fun submit(module: AuthCodeBodyModule) {
        // 認証処理を送信
        module.getAuthSubmitElement().submit()
    }
}