package nsoushi.selenide.spec.pages

import nsoushi.selenide.spec.support.ScreenshotSupport

/**
 *
 * @author nsoushi
 */
abstract class PageBase(screenshot: ScreenshotSupport) : Page, ScreenshotSupport by screenshot
