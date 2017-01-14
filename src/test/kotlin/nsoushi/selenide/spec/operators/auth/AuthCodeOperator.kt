package nsoushi.selenide.spec.operators.auth

import nsoushi.selenide.spec.pages.auth.AuthCodePage

/**
 * 認証コード／オペレータークラス
 *
 * @author nsoushi
 */
class AuthCodeOperator {

    /**
     * 認証コードを入力してログインします
     */
    fun auth(page: AuthCodePage, code: String) {
        // 認証コードのinputフィールドに認証コードを入力
        page.getCodeBodyModule().setAuthCodeInputValue(code)
        // 認証処理を送信
        page.getCodeBodyModule().getAuthSubmitElement().submit()
    }
}