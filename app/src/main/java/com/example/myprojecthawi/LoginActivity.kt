package com.example.myprojecthawi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myprojecthawi.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.btnLogin.setOnClickListener {

            if (binding.edPassword.text.trim().isNotEmpty() || binding.edPassword.text.trim()
                    .isNotEmpty()
            ) {
                //
                Toast.makeText(this, "Input Provided", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Input Required", Toast.LENGTH_LONG).show()

            }
        }

        binding.tvRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java);
            startActivity(intent)
        }

        binding.btnLogin.setOnClickListener {

            if (binding.edUsername.text.toString() == "admin" && binding.edPassword.text.toString() == "hawii") {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {
                var toast = Toast.makeText(
                    applicationContext,
                    "username or password incorrect",
                    Toast.LENGTH_LONG
                )
                toast.show()
            }

        }

    }
}