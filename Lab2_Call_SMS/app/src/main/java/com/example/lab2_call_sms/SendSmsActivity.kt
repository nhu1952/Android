package com.example.lab2_call_sms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab2_call_sms.databinding.ActivitySendSmsBinding

class SendSmsActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySendSmsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySendSmsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //quay lai main
        binding.btnback2.setOnClickListener {
            val i4=Intent(this, MainActivity::class.java)
            startActivity(i4)
        }
    }
}