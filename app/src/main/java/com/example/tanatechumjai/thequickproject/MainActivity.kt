package com.example.tanatechumjai.thequickproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Bt1.apply {
            setOnClickListener {
                val intent = Intent(this@MainActivity, MainPageOne::class.java)
                startActivity(intent)
            }
        }
        Bt2.apply {
            setOnClickListener {

            }
        }
        Bt3.apply {
            setOnClickListener {

            }
        }
        Bt4.apply {
            setOnClickListener {

            }
        }
    }
}
