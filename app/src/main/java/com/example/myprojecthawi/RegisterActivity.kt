package com.example.myprojecthawi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myprojecthawi.databinding.ActivityLoginBinding
import com.example.myprojecthawi.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnRegister.setOnClickListener {
            if(binding.editUsername.text.trim().isNotEmpty()||binding.editFirstName.text.isNotEmpty()||binding.editSecondName.text.isNotEmpty()|| binding.editEmail.text.isNotEmpty()|| binding.editPhoneNo.text.isNotEmpty()||binding.editPassword.text.isNotEmpty()||binding.editCPassword.text.isNotEmpty()){
                Toast.makeText(this,"Input Provided", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"Input Required", Toast.LENGTH_LONG).show()
            }
        }

        binding.tvLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java);
            startActivity(intent);
        }
    }
}