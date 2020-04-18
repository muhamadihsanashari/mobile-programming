package com.ashart.mobileprogramming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnActivity: Button = findViewById(R.id.btn_activity)
        btnActivity.setOnClickListener(this)

        val btnAlertToas: Button = findViewById(R.id.btn_alert_and_toast)
        btnAlertToas.setOnClickListener(this)

        val btnList: Button = findViewById(R.id.btn_list)
        btnList.setOnClickListener(this)

        val btnTabView: Button = findViewById(R.id.btn_tabview)
        btnTabView.setOnClickListener(this)

        val btnCamera: Button = findViewById(R.id.btn_camera)
        btnCamera.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_activity -> {
                val intent = Intent(this@MainActivity, LoginActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_alert_and_toast -> {
                val intent = Intent(this@MainActivity, AlertToastActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_list -> {
                Toast.makeText(this@MainActivity, "Tes !", Toast.LENGTH_SHORT).show()
                val intent = Intent(this@MainActivity, ListViewActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_tabview -> {
                val intent = Intent(this@MainActivity, TabViewActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_camera -> {
                val intent = Intent(this@MainActivity, CameraActivity::class.java)
                startActivity(intent)
            }
        }
    }
}

