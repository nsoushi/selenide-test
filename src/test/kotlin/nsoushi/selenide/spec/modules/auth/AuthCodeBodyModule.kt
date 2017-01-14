package nsoushi.selenide.spec.modules.auth

/**
 * 認証コード入力モジュールクラス
 *
 * @author nsoushi
 */
class AuthCodeBodyModule : AuthCodeBodyModuleBase() {

    /**
     * 認証コード入力フィールドの取得
     */
    fun getAuthCodeInputElement() = authCodeInputElement()

    /**
     * 認証コード入力フィールドに値をセットする
     */
    fun setAuthCodeInputValue(value: String) = authCodeInputElement().`val`(value)

    /**
     * 認証コード入力フィールドに値を取得する
     */
    fun getAuthCodeInputValue() = authCodeInputElement().`val`()

    /**
     * 認証コード送信ボタンの取得
     */
    fun getAuthSubmitElement() = authSubmitElement()
}