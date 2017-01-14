package nsoushi.selenide.spec.support

import org.openqa.selenium.WebDriver
import ru.yandex.qatools.ashot.AShot
import ru.yandex.qatools.ashot.shooting.ShootingStrategies
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

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

class ScreenshotSupportImpl : ScreenshotSupport {

    override fun takeScreenshot(driver: WebDriver): BufferedImage {
        val screenshot = AShot()
                .shootingStrategy(ShootingStrategies.viewportPasting(100))
                .takeScreenshot(driver)
        return screenshot.image
    }

    override fun storeImageToFs(image: BufferedImage, storePath: String) {
        ImageIO.write(image, "PNG", File(storePath));
    }
}

