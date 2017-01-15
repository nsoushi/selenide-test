package nsoushi.selenide.spec.operators.program

import nsoushi.selenide.spec.modules.program.ProgramHeaderModule
import nsoushi.selenide.spec.pages.program.ProgramPage

/**
 * 番組／オペレーターBaseクラス
 *
 * @author nsoushi
 */
interface ProgramOperatorBase {

    /**
     * 番組をフォローします
     */
    fun follow(module: ProgramHeaderModule)
}
