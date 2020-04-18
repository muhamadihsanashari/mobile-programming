package com.ashart.mobileprogramming

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_alert_toast.*

class AlertToastActivity : AppCompatActivity() {

    lateinit var notificationManager : NotificationManager
    lateinit var notificationChannel : NotificationChannel
    lateinit var builder : Notification.Builder
    private val channelId = "mobile programming"
    private val description = "Test notification!"

    lateinit var txtNotification : String
    lateinit var txtJudul : String
    lateinit var txtIsi :String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_toast)

        btn_show.setOnClickListener {
            txtNotification = et_notifilkasi.text.toString()
            val mAlertDialog = AlertDialog.Builder(this@AlertToastActivity)
            mAlertDialog.setIcon(R.mipmap.ic_launcher_round)
            mAlertDialog.setTitle(txtNotification)
            mAlertDialog.setMessage("Apakah Anda ingin menampilkan notifikasi ?")
            mAlertDialog.setPositiveButton("Ya") { dialog, id ->

                val intent = Intent(this, AlertToastActivity::class.java)
                val pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)

                notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager


                txtJudul = et_jdl_notifikasi.text.toString()
                txtIsi = et_isi_notifikasi.text.toString()

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    notificationChannel = NotificationChannel(channelId, description, NotificationManager.IMPORTANCE_HIGH)
                    notificationChannel.enableLights(true)
                    notificationChannel.lightColor = Color.RED
                    notificationChannel.enableVibration(true)
                    notificationManager.createNotificationChannel(notificationChannel)

                    builder = Notification.Builder(this, channelId)
                        .setContentTitle(txtJudul)
                        .setContentText(txtIsi)
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setContentIntent(pendingIntent)
                }else{
                    builder = Notification.Builder(this)
                        .setContentTitle(txtJudul)
                        .setContentText(txtIsi)
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setContentIntent(pendingIntent)
                }
                notificationManager.notify(1234, builder.build())

            }
            mAlertDialog.setNegativeButton("Tidak") { dialog, id ->
                Toast.makeText(this@AlertToastActivity, "Yasudah!", Toast.LENGTH_SHORT).show()
            }
            mAlertDialog.show()
        }
    }
}
