package com.example.lab2_2

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bLog:Button = findViewById(R.id.button_log)
        val bTimber:Button = findViewById(R.id.button_timber)
        val text:EditText = findViewById(R.id.text)

        Timber.plant(Timber.DebugTree())
        bLog.setOnClickListener{
            Log.v("From EditText", text.getText().toString());
        }


        bTimber.setOnClickListener{
            Timber.v(text.getText().toString())
        }
    }
}