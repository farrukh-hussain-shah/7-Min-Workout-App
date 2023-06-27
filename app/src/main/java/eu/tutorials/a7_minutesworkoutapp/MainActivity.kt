package eu.tutorials.a7_minutesworkoutapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.FrameLayout
import android.widget.Toast
import eu.tutorials.a7_minutesworkoutapp.databinding.ActivityMainBinding

//import eu.tutorials.a7_minutesworkoutapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding:ActivityMainBinding?=null
    private var tts: TextToSpeech? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)


//        tts = TextToSpeech(this, this)
//        speakOut("Get Ready For exercises")

////        val fLStartButton:FrameLayout = findViewById(R.id.flStart)
        binding?.flStart?.setOnClickListener {
           val intent=Intent(this,ExerciseActivity::class.java)
            startActivity(intent)

        }
    }



    override fun onDestroy() {
        super.onDestroy()
        binding=null
    }
}