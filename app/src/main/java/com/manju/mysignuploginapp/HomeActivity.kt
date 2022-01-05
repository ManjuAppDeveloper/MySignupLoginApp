package com.manju.mysignuploginapp

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    private val sharedPrefFile = "kotlinsharedpreference"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val outputUserName = findViewById<TextView>(R.id.textViewname)
        val outputPwd = findViewById<TextView>(R.id.textViewpwd)
        val sharedPreferences: SharedPreferences = this.getSharedPreferences(sharedPrefFile,
            Context.MODE_PRIVATE)

        val sharedName = sharedPreferences.getString("name_key",null)
        val sharedPwd = sharedPreferences.getString("pwd_key",null)

        outputUserName.setText("user name: ${sharedName}").toString()
        outputPwd.setText("password: ${sharedPwd}").toString()
    }
}