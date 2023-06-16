package com.example.fitway

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    lateinit var tx_register:TextView
    lateinit var edt_name:EditText
    lateinit var edt_email:EditText
    lateinit var edt_phonenumber:EditText
    lateinit var edt_password:EditText
    lateinit var edt_age:EditText
    lateinit var btn_register:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        tx_register = findViewById(R.id.txregister)
        edt_name = findViewById(R.id.edtname)
        edt_email = findViewById(R.id.edtemail)
        edt_phonenumber = findViewById(R.id.edtphone)
        edt_password = findViewById(R.id.edtpassword)
        edt_age = findViewById(R.id.edtage)
        btn_register = findViewById(R.id.btnregister)

        btn_register.setOnClickListener {
            val username = edt_name.text.toString()
            val email = edt_email.text.toString()
            val password = edt_password.text.toString()
            val phonenumber = edt_phonenumber.text.toString()
            val age = edt_age.text.toString()

            // Perform registration logic here
            registerUser(username, email, password, phonenumber, password, )

        }
    }

        private fun registerUser(
            username: String,
            email: String,
            password: String,
            phonenumber: String,
            age: String
        ) {
            // TODO: Implement your registration logic here

            // Example code to start the main activity after registration
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }