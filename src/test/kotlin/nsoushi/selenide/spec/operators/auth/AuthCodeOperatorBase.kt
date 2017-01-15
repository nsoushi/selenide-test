package nsoushi.selenide.spec.operators.auth

import nsoushi.selenide.spec.modules.auth.AuthCodeBodyModule

/**
 * 認証コード／オペレーターBaseクラス
 *
 * @author nsoushi
 */
interface AuthCodeOperatorBase {

    /**
     * 認証コードを入力します
     */
    fun input(module: AuthCodeBodyModule, code: String)

    /**
     * 認証します
     */
    fun submit(module: AuthCodeBodyModule)
}