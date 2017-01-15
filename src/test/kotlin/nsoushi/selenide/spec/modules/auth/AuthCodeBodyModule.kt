package nsoushi.selenide.spec.modules.auth

/**
 * 認証コード入力モジュールクラス
 *
 * @author nsoushi
 */
class AuthCodeBodyModule : AuthCodeBodyModuleBase() {

    /**
     * 認証コード入力フィールドに値をセットする
     */
    fun setAuthCodeInputValue(value: String) = authCodeInputElement().`val`(value)

    /**
     * 認証コード送信ボタンの取得
     */
    fun getAuthSubmitElement() = authSubmitElement()
}