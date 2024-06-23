package com.muzaffar.hackapp

import android.content.DialogInterface
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val message = "Username ${intent.getStringExtra("username")} \n Password is" +
                "${intent.getStringExtra("password")}"

        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("Sensitive Data was accessed!")
            .setMessage(message)
            .setCancelable(false)
            .setNegativeButton("OK"){
                dialogInterface:DialogInterface, i:Int ->
                dialogInterface.dismiss()
            }
        alertDialogBuilder.create().show()

    }
}