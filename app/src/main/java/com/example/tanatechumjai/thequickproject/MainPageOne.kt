package com.example.tanatechumjai.thequickproject

import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.support.design.bottomappbar.BottomAppBar
import android.support.design.internal.BottomNavigationMenu
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.pageone.*
import org.json.JSONArray
import org.json.JSONObject
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.InputStream
import java.util.*

class MainPageOne: AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pageone)

        navigation1.setOnNavigationItemSelectedListener {item ->
            when(item.itemId){
                R.id.backhome -> finish()
            }
            true
        }

    }
    
//    fun main(args : Array<String>) {
//        var json : String? = null
//        val inputStream: InputStream = assets.open("ap.json")
//
//        json = inputStream.bufferedReader().use { it.readText() }
//        val js = JSONObject(json)
//        val js1 = "${js}"
//        val base64ImageString = encoder(js1)
//        Log.e("test","${base64ImageString}")
//
//
//        decoder(base64ImageString, "${inputStream}")

//    }

//    fun encoder(filePath: String): String{
//        val bytes = File(filePath).readBytes()
//        val base64 = Base64.getEncoder().encodeToString(bytes,0)
//        return base64
//    }
//
//    fun decoder(base64Str: String, pathFile: String): Unit{
//        val imageByteArray = Base64.getDecoder().decode(base64Str)
//        File(pathFile).writeBytes(imageByteArray)
//    }
}
