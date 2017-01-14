package nsoushi.selenide.spec.pages

import com.codeborne.selenide.Selenide
import com.codeborne.selenide.SelenideElement
import com.codeborne.selenide.WebDriverRunner
import org.openqa.selenium.Cookie
import org.openqa.selenium.WebDriver

/**
 *
 * @author nsoushi
 */
interface Page {

    fun open(url: String, cookies: List<Cookie>?): WebDriver {
        val webDriver = WebDriverRunner.getWebDriver()
        webDriver.manage().window().maximize()
        open(webDriver, url, cookies)
        return webDriver
    }

    fun open(webDriver: WebDriver, url: String, cookies: List<Cookie>?): WebDriver {
        cookies?.forEach { webDriver.manage().addCookie(it) }
        Selenide.open(url)
        return webDriver
    }
}
