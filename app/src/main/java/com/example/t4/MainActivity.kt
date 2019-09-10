package com.example.t4

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.renderscript.Sampler
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.parse.ParseObject
import com.parse.ParseQuery
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.find
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity(), AnkoLogger {
    private lateinit var mButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mButton = findViewById(R.id.login_button)


        mButton.setOnClickListener {
            startActivity<ActivitySaveInParse>()
        }


    }
}
