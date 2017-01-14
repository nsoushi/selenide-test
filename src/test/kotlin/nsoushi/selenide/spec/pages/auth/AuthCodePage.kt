package nsoushi.selenide.spec.pages.auth

import com.codeborne.selenide.Condition.*
import com.codeborne.selenide.SelenideElement
import nsoushi.selenide.spec.modules.auth.AuthCodeBodyModule
import nsoushi.selenide.spec.modules.program.ProgramHeaderModule
import nsoushi.selenide.spec.modules.program.ProgramPlayerModule

/**
 * 認証ページにあるモジュールの要素を扱うPageクラス
 *
 * @author nsoushi
 */
class AuthCodePage : AuthCodePageBase(AuthCodeBodyModule()) {

    /**
     * 認証コード入力モジュールの取得
     */
    fun getCodeBodyModule() : AuthCodeBodyModule {
        return codeBodyModule()
    }

    /**
     * 認証コード入力要素の取得
     */
    fun getCodeBodyElement() : SelenideElement {
        return codeBodyModule().getElement()
    }
}