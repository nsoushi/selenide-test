package nsoushi.selenide.spec.operators.program

import nsoushi.selenide.spec.pages.program.ProgramPage

/**
 * 番組／オペレーター
 *
 * @author nsoushi
 */
class ProgramOperator {

    /**
     * 番組をフォローします
     */
    fun follow(page: ProgramPage) {
        // フォローする
        page.getHeaderModule().getFollowButtonElement().click()
    }
}
