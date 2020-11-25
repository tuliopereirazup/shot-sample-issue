package br.com.tuliomagalhaes.shottestapp

import androidx.test.core.app.ActivityScenario
import com.karumi.shot.ActivityScenarioUtils.waitForActivity
import com.karumi.shot.ScreenshotTest

import org.junit.Test

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleInstrumentedTest : ScreenshotTest {
    @Test
    fun theActivityIsShownProperly() {
        val activity = ActivityScenario.launch(MainActivity::class.java).waitForActivity()
        compareScreenshot(activity)
    }
}