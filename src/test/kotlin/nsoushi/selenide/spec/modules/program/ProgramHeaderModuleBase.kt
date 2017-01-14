package nsoushi.selenide.spec.modules.program

import com.codeborne.selenide.*
import com.codeborne.selenide.Selenide.`$`
import nsoushi.selenide.spec.modules.Module

/**
 * 動画情報モジュール抽象クラス
 *
 * @author nsoushi
 */
abstract class ProgramHeaderModuleBase : Module {

    companion object {
        const val cssSelector: String = ".Program__header"
    }

    /**
     * 動画情報モジュールの取得
     */
    override fun getElement(): SelenideElement = `$`(cssSelector)

    /**
     * フォローモジュールの取得
     */
    protected fun followElement(): SelenideElement {
        return getElement().`$`(".FollowButton")
    }

    /**
     * フォローボタンの取得
     */
    protected fun followButtonElement(): SelenideElement {
        return followElement().`$`("button")
    }
}
