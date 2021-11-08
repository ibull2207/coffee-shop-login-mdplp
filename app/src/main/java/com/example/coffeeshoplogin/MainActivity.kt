package com.example.coffeeshoplogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login()
    }

    private fun login(){

        val etUsername = findViewById<EditText>(R.id.et_username)
        val etPassword = findViewById<EditText>(R.id.et_passwoord)
        val btn_login = findViewById<Button>(R.id.btn_login)

        btn_login.setOnClickListener {

            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            if (username.isEmpty()){

                etUsername.error = "Field tidak boleh kosong"
            }
            if (password.isEmpty()){

                etPassword.error = "Field tidak boleh kosong"
            }
            else{

                Toast.makeText(this,"Berhasil login",Toast.LENGTH_SHORT).show()
            }
        }
    }
}