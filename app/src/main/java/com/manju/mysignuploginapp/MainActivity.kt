package com.manju.mysignuploginapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val sharedPrefFile = "kotlinsharedpreference"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin=findViewById<Button>(R.id.btnLogin) as Button
        val etUsername=findViewById<EditText>(R.id.userName) as EditText
        val etPassword=findViewById<EditText>(R.id.passWord) as EditText

        val sharedPreferences: SharedPreferences = this.getSharedPreferences(sharedPrefFile, Context.MODE_PRIVATE)
        btnLogin.setOnClickListener ( View.OnClickListener {

            val name:String =etUsername.text.toString()
            val pwd:String = etPassword.text.toString()
            val editor:SharedPreferences.Editor=sharedPreferences.edit()
            editor.putString("name_key",name)
            editor.putString("pwd_key",pwd)
            editor.apply()
            editor.commit()
            intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        } )

    }


}