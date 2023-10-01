package com.example.lab2_call_sms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.lab2_call_sms.databinding.ActivityCameraBinding
import com.example.lab2_call_sms.databinding.ActivityMainBinding

class CameraActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCameraBinding
    private val my_code: Int =0
    private lateinit var imageView: ImageView
    // var binding:ActivityMainBinding? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityCameraBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Back 5
        binding.back5.setOnClickListener {
            val n2=Intent(this,MainActivity::class.java)
            startActivity(n2)
        }

        //ảnh
//        binding.img.setOnClickListener(
//            Intent(Intent.ACTION_GET_CONTENT).also {
//                it.type = "image/*"
//                startActivity(it,0)
//            }
 //       )
    }
}