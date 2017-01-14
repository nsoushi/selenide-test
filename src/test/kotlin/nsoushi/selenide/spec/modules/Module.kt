package nsoushi.selenide.spec.modules

import com.codeborne.selenide.SelenideElement
import kotlin.reflect.KProperty

/**
 * モジュールクラス
 *
 * @author nsoushi
 */
interface Module {

    /**
     * WebElementの取得
     */
    fun getElement(): SelenideElement
}