package nsoushi.selenide.spec.pages.program

import nsoushi.selenide.spec.modules.program.ProgramHeaderModule
import nsoushi.selenide.spec.modules.program.ProgramPlayerModule
import nsoushi.selenide.spec.operators.program.ProgramOperatorBase
import nsoushi.selenide.spec.pages.PageBase
import nsoushi.selenide.spec.support.ScreenshotSupportImpl

/**
 * 番組ページに必要なモジュールを定義するBaseクラス
 *
 * @author nsoushi
 */
abstract class ProgramPageBase constructor(
        private val programOperator: ProgramOperatorBase,
        private val playerModule: ProgramPlayerModule,
        private val headerModule: ProgramHeaderModule
) : PageBase(ScreenshotSupportImpl()), ProgramOperatorBase by programOperator {

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

    /**
     * 番組をフォローする
     */
    protected fun follow() {
        programOperator.follow(headerModule)
    }
}