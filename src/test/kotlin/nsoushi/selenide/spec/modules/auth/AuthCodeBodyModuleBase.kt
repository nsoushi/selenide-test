package nsoushi.selenide.spec.modules.auth

import com.codeborne.selenide.Selenide
import com.codeborne.selenide.SelenideElement
import nsoushi.selenide.spec.modules.Module

/**
 * 認証コード入力モジュール抽象クラス
 *
 * @author nsoushi
 */
abstract class AuthCodeBodyModuleBase : Module {

    companion object {
        const val cssSelector: String = ".AuthCode__body"
    }

    /**
     * 認証コード入力モジュールの取得
     */
    override fun getElement(): SelenideElement = Selenide.`$`(cssSelector)

    /**
     * 認証コード入力フィールドの取得
     */
    protected fun authCodeInputElement(): SelenideElement {
        return getElement().`$`("span input")
    }

    /**
     * 認証コード送信ボタンの取得
     */
    protected fun authSubmitElement(): SelenideElement {
        return getElement().`$`("button[type=submit]")
    }
}
