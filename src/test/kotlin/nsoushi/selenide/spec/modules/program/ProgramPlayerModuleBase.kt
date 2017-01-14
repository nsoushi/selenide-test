package nsoushi.selenide.spec.modules.program

import com.codeborne.selenide.*
import com.codeborne.selenide.Selenide.`$`
import nsoushi.selenide.spec.modules.Module

/**
 * 動画プレイヤーモジュール抽象クラス
 *
 * @author nsoushi
 */
abstract class ProgramPlayerModuleBase : Module {

    companion object {
        const val cssSelector: String = ".ProgramPlayer"
    }

    /**
     * 動画プレイヤーモジュールの取得
     */
    override fun getElement(): SelenideElement = `$`(cssSelector)
}
