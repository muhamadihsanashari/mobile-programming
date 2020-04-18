package com.ashart.mobileprogramming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_NIM = "extra_nim"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvName: TextView = findViewById(R.id.tv_name)
        val tvNim: TextView = findViewById(R.id.tv_nim)

        val name = intent.getStringExtra(EXTRA_NAME)
        val nim = intent.getStringExtra(EXTRA_NIM)

        val text_name = name
        tvName.text = text_name
        val text_nim = nim
        tvNim.text = text_nim

        btn_main_menu.setOnClickListener {
            val intent = Intent(this@SecondActivity, MainActivity::class.java)
            startActivity(intent)
        }

    }

}
