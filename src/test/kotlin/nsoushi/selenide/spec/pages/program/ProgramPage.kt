package nsoushi.selenide.spec.pages.program

import com.codeborne.selenide.SelenideElement
import nsoushi.selenide.spec.modules.program.ProgramHeaderModule
import nsoushi.selenide.spec.modules.program.ProgramPlayerModule

/**
 * 番組ページにあるモジュールの要素を扱うPageクラス
 *
 * @author nsoushi
 */
class ProgramPage : ProgramPageBase(ProgramPlayerModule(), ProgramHeaderModule()) {

    /**
     * 動画プレイヤーモジュールの取得
     */
    fun getPlayerModule() : ProgramPlayerModule {
        return playerModule()
    }

    /**
     * 動画プレイヤー要素の取得
     */
    fun getPlayerElement() : SelenideElement {
        return playerModule().getElement()
    }

    /**
     * 動画情報モジュールの取得
     */
    fun getHeaderModule() : ProgramHeaderModule {
        return headerModule()
    }

    /**
     * 動画情報要素の取得
     */
    fun getHeaderElement() : SelenideElement {
        return headerModule().getElement()
    }
}