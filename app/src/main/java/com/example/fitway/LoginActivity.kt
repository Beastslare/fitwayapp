package com.example.fitway

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    lateinit var tx_login:TextView
    lateinit var edt_email:EditText
    lateinit var edt_password:EditText
    lateinit var btn_login:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        tx_login = findViewById(R.id.txlogin)
        edt_password = findViewById(R.id.edtpassword)
        edt_email = findViewById(R.id.edtemail)
        btn_login = findViewById(R.id.btnlogin)

        btn_login.setOnClickListener {
            val email = edt_email.text.toString()
            val password = edt_password.text.toString()
            loginUser(email,password)
        }
    }
    private fun loginUser(email: String, password: String) {
        // TODO: Implement your login logic here

        // Example code to simulate login success
        if (email == "user@example.com" && password == "password") {
            // Start the main activity after successful login
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        } else {
            // Show a toast indicating login failure
            Toast.makeText(this, "Invalid email or password", Toast.LENGTH_SHORT).show()
        }
    }
}
