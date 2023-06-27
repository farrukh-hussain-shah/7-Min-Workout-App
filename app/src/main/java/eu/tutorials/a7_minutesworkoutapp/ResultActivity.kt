package eu.tutorials.a7_minutesworkoutapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ResultActivity : AppCompatActivity() {
    private lateinit var GoToActivity1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        GoToActivity1=findViewById(R.id.btn_finish)
        GoToActivity1.setOnClickListener{
            val intent=Intent(this@ResultActivity,MainActivity::class.java)
            startActivity(intent)
        }
    }
}