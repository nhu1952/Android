package com.example.lab1notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.lab1notes.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var user: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        user = FirebaseAuth.getInstance()

       checkIfUserIsLogged()

        binding.btnLogin.setOnClickListener {
            registerUser()
        }
    }

    private fun checkIfUserIsLogged(){

        if (user.currentUser != null){
            startActivity(Intent(this, Activity2::class.java))
            finish()
        }
    }

    private fun registerUser(){

        val email = binding.etEmail.text.toString()
        val password = binding.etPassword.text.toString()

        if (email.isNotEmpty() && password.isNotEmpty()){

            user.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(MainActivity()) { task ->
                    if (task.isSuccessful){

                        Toast.makeText(this,
                            "user added successfully!!",
                            Toast.LENGTH_SHORT)
                            .show()

                        startActivity(Intent(this,
                            Activity2::class.java))
                        finish()

                    }else{

                        user.signInWithEmailAndPassword(email,password)
                            .addOnCompleteListener { mTask ->

                                if (mTask.isSuccessful){

                                    startActivity(Intent(this,
                                        Activity2::class.java))
                                    finish()

                                }else{
                                    Toast.makeText(this,
                                        task.exception!!.message ,
                                        Toast.LENGTH_SHORT)
                                        .show()
                                }
                            }
                    }
                }
        }else{
            Toast.makeText(this,
                "email and password cannot be empty!!",
                Toast.LENGTH_SHORT).show()
        }
    }


}