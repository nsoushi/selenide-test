package nsoushi.selenide.spec.pages.program

import com.codeborne.selenide.SelenideElement
import nsoushi.selenide.spec.modules.program.ProgramHeaderModule
import nsoushi.selenide.spec.modules.program.ProgramPlayerModule
import nsoushi.selenide.spec.pages.Page
import nsoushi.selenide.spec.pages.PageBase
import nsoushi.selenide.spec.support.ScreenshotSupport
import nsoushi.selenide.spec.support.ScreenshotSupportImpl

/**
 * 番組ページに必要なモジュールを定義するBaseクラス
 *
 * @author nsoushi
 */
abstract class ProgramPageBase constructor(
        private val playerModule: ProgramPlayerModule,
        private val headerModule: ProgramHeaderModule) : PageBase(ScreenshotSupportImpl()) {

    /**
     * 動画プレイヤーモジュールの取得
     */
    protected fun playerModule(): ProgramPlayerModule {
        return playerModule
    }

    /**
     * 動画情報モジュールの取得
     */
    protected fun headerModule(): ProgramHeaderModule {
        return headerModule
    }
}