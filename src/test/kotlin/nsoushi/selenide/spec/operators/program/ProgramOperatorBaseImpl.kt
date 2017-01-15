package nsoushi.selenide.spec.operators.program

import nsoushi.selenide.spec.modules.program.ProgramHeaderModule
import nsoushi.selenide.spec.pages.program.ProgramPage

/**
 * 番組／オペレーター
 *
 * @author nsoushi
 */
class ProgramOperatorBaseImpl : ProgramOperatorBase {

    /**
     * 番組をフォローします
     */
    override fun follow(module: ProgramHeaderModule) {
        // フォローする
        module.getFollowButtonElement().click()
    }
}
