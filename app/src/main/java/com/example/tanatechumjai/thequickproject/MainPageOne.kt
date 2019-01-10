package com.example.tanatechumjai.thequickproject

import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Base64
import android.util.Log
import kotlinx.android.synthetic.main.pageone.*
import org.json.JSONObject
import java.io.ByteArrayOutputStream
import java.io.InputStream

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

        var json : String? = null
        val inputStream: InputStream = assets.open("newfile.json")
        var baos = ByteArrayOutputStream()
        json = inputStream.bufferedReader().use { it.readText() }
        val js = JSONObject(json)
        val jsonrr = js.getString("datamining")

        var imageBytes = Base64.decode(jsonrr, Base64.DEFAULT)
        var decodedImage = BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.size)
//        var decodedImage = BitmapFactory.decodeFile(jsonrr)
        img_pa.setImageBitmap(decodedImage)





    }
}
