package com.example.lab2_call_sms

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.net.ConnectivityManagerCompat
import com.example.lab2_call_sms.databinding.ActivityCallPhoneBinding

class CallPhoneActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCallPhoneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCallPhoneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //quay lai main
        binding.btnback1.setOnClickListener {
            val i3=Intent(this,MainActivity::class.java)
            startActivity(i3)
        }
        //call phone
        // chưa hoàn thành
        binding.edtphone.setOnClickListener {
            val i8 = Intent(Intent.ACTION_CALL)
            val phone = binding.edtphone.text.toString()
            if (phone.matches(Regex("\\d{10}"))){
                val uri=Uri.parse("tel:$phone")
                i8.data = uri
                //?????????
               //if (i8.resolveActivity(packageManager)!= null)
                //   if (Compat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
//                       startActivity(i8)
//                   } else {
//                       // request permission
//                   }

            }
            startActivity(i8)
        //Uri.parse("tel:")
        //Uri.parse("tel:"+ editphone.getText().toString()));
//            if (ActivityCompat.checkSelfPermission(CallActivity.this,
//                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                ActivityCompat.requestPermissions(CallActivity.this, new
//                        String[]{android.Manifest.permission.CALL_PHONE}, 1);
//                return;
            }
        }

     //   startActivity(callintent);
        }
