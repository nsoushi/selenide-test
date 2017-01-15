package nsoushi.selenide.spec.support

import org.openqa.selenium.WebDriver
import java.awt.image.BufferedImage

/**
 *
 * @author nsoushi
 */
interface ScreenshotSupport {

    /**
     * スクリーンショットを撮る
     */
    fun takeScreenshot(driver: WebDriver): BufferedImage

    /**
     * スクリーンショットをFilesystem保存する
     */
    fun storeImageToFs(image: BufferedImage, storePath: String)
}

