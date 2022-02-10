package com.example.bookbarn

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.bookbarn.databinding.ActivityRegisterBinding

class Register: AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.SignUp.setOnClickListener {

            if (binding.EnterEmail.text.isEmpty() &&
                binding.UserName.text.isEmpty() &&
                binding.EnterPassword.text.isEmpty() &&
                binding.ConfirmPassword.text.isEmpty()
            )
            {
                Toast.makeText(this, "Input Required Fields", Toast.LENGTH_SHORT).show()
            }
            else
            {
                if (binding.EnterEmail.text.contentEquals("aniekong007@gmail.com") &&
                     binding.UserName.text.contentEquals("ndekong") &&
                     binding.EnterPassword.text.contentEquals("ghost") &&
                     binding.ConfirmPassword.text.contentEquals("ghost"))

                {
                    val intent = Intent(this, ExploreActivity::class.java)
                    startActivity(intent)
                }
                else
                {
                  Toast.makeText(this, "Invalid Email or Password", Toast.LENGTH_SHORT).show()
                }
            }




        }

















    }



























}