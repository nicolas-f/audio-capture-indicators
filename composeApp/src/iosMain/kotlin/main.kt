import androidx.compose.ui.window.ComposeUIViewController
import org.noise_planet.audiocapture.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
