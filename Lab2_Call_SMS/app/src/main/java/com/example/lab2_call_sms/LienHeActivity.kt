package com.example.lab2_call_sms

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab2_call_sms.databinding.ActivityLienHeBinding

class LienHeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLienHeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLienHeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //button imgfb
        binding.imgfb.setOnClickListener{
            openUrl("https://www.facebook.com/huynhnhu.1952")
        }
        //button imgdiscord
        binding.imgdiscord.setOnClickListener{
            openUrl("https://discord.gg/ZXQXqYy7")
        }
        //button imggifhub
        binding.imggifhub.setOnClickListener{
            openUrl("https://github.com/nhu1952")
        }
        //quay lai main
        binding.bntback4.setOnClickListener {
            val i7=Intent(this,MainActivity::class.java)
            startActivity(i7)
        }

    }
    private fun openUrl(link: String){

        val uri = Uri.parse(link)
        val i6 = Intent(Intent.ACTION_VIEW, uri)
        startActivity(i6)

    }
}