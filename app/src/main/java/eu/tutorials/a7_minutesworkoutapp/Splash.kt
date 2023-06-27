import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import eu.tutorials.a7_minutesworkoutapp.MainActivity
import eu.tutorials.a7_minutesworkoutapp.R

class Splash : AppCompatActivity() {
    private val splashDelay: Long = 30000 // Splash screen delay in milliseconds (3 seconds)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val intent = Intent(this@Splash, MainActivity::class.java)
            startActivity(intent)
            finish() // Finish the splash activity to prevent going back to it
        }, splashDelay)
    }
}
