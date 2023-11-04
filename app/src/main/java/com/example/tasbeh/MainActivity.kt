package com.example.tasbeh
import Catch.MySharedPreference
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tasbeh.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var preferences: SharedPreferences
    var a = 0
    var link = "https://namozvaqti.uz/shahar/fargona"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        MySharedPreference.init(this)
        val list = MySharedPreference.obektString

        binding.btnVaqt.setOnClickListener {
            val link = "https://namozvaqti.uz/shahar/fargona"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse("$link")
            startActivity(i)
        }
        binding.btnCount.setOnClickListener {
            a++
            writetasbeh()
        }



        var sharedPreferences = getSharedPreferences("my_catch_file", MODE_PRIVATE)
        a = sharedPreferences.getInt("keyTasbeh" , 0)
        writetasbeh()

        binding.tvCount.setOnClickListener {
            var intent = Intent(this, sharedPreferences::class.java)
            startActivity(intent)
            writetasbeh()
        }



    }
    fun writetasbeh(){
        binding.tvCount.text = a.toString()
        addCatch()
    }

    fun addCatch(){
        val sharedPreferences =""
        val editer = sharedPreferences.toString()

    }


}