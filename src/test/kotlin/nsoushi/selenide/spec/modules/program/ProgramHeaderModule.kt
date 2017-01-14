package nsoushi.selenide.spec.modules.program

/**
 * 動画情報モジュール
 *
 * @author nsoushi
 */
class ProgramHeaderModule : ProgramHeaderModuleBase() {

    /**
     * フォローモジュールの取得
     */
    fun getFollowElement() = followElement()

    /**
     * フォローしているかどうか
     */
    fun isFollowing(): Boolean = followElement().attr("class").contains("is-following")

    /**
     * フォローボタンの取得
     */
    fun getFollowButtonElement() = followButtonElement()
}
