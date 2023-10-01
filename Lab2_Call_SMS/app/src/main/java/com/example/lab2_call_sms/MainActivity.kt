package com.example.lab2_call_sms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.lab2_call_sms.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //gọi callphone
        binding.btncallphone.setOnClickListener {
            val i = Intent(this,CallPhoneActivity::class.java)
            startActivity(i)
        }
        //gọi SendSMS
        binding.btnsendsms.setOnClickListener {
            val i2 = Intent(this, SendSmsActivity::class.java)
            startActivity(i2)
        }
        //gọi Liên Hệ
        binding.btnlh.setOnClickListener {
            val i5=Intent(this,LienHeActivity::class.java)
            startActivity(i5)
        }
        // gọi camera
        binding.btbcamera.setOnClickListener {
            val n1=Intent(this,CameraActivity::class.java)
            startActivity(n1)
        }

//       btncallphone.setOnClickListener {
//            val i = Intent(this, CallPhoneActivity::class.java)
//            startActivity(i)
//        }
//
//        //goi SendSMS
//        btnsendsms.setOnClickListener {
//            val y = Intent(this, SendSmsActivity::class.java)
//            startActivity(y) //       }
    }
}
