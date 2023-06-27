package eu.tutorials.a7_minutesworkoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import eu.tutorials.a7_minutesworkoutapp.databinding.ActivityTextToSpeachBinding

class TextToSpeach(textToSpeach: TextToSpeach, textToSpeach1: TextToSpeach) : AppCompatActivity() {
    private var tts:TextToSpeach?=null
    private var binding:ActivityTextToSpeachBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityTextToSpeachBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        tts=TextToSpeach(this,this)
    }
}