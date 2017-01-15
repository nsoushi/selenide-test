package nsoushi.selenide.spec.pages.program

import com.codeborne.selenide.Condition.enabled
import nsoushi.selenide.spec.modules.program.ProgramHeaderModule
import nsoushi.selenide.spec.modules.program.ProgramPlayerModule
import nsoushi.selenide.spec.operators.program.ProgramOperatorBaseImpl

/**
 * 番組ページにあるモジュールの要素を扱うPageクラス
 *
 * @author nsoushi
 */
class ProgramPage : ProgramPageBase(ProgramOperatorBaseImpl(), ProgramPlayerModule(), ProgramHeaderModule()) {

    /**
     * 動画プレイヤーモジュールが配置されているか
     */
    fun hasPlayerModule() = playerModule().getElement().`is`(enabled)

    /**
     * 動画情報モジュールが配置されているか
     */
    fun hasHeaderModule() = headerModule().getElement().`is`(enabled)

    /**
     * 番組をフォローする
     */
    fun executeFollow() = follow()

    /**
     * 番組をフォローしているか
     */
    fun isFollowing(): Boolean = headerModule().isFollowing() == true
}