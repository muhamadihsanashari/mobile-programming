package com.ashart.mobileprogramming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    lateinit var txtUsername : String
    lateinit var txtPassword : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_cancel.setOnClickListener {
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(intent)
        }

        btn_login.setOnClickListener {
            txtUsername = et_username.text.toString()
            txtPassword = et_password.text.toString()

            val intent = Intent(this@LoginActivity, SecondActivity::class.java)
            intent.putExtra(SecondActivity.EXTRA_NAME, txtUsername)
            intent.putExtra(SecondActivity.EXTRA_NIM, txtPassword)
            startActivity(intent)
        }
    }

}
