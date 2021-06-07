package com.example.springminds

import android.content.DialogInterface
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        val builder: android.app.AlertDialog.Builder = android.app.AlertDialog.Builder(this)
        builder.setCancelable(false)
        builder.setMessage("Do you want to Exit?")
        builder.setPositiveButton("Yes",
            DialogInterface.OnClickListener { dialog, which -> //if user pressed "yes", then he is allowed to exit from application
                finish()
            })
        builder.setNegativeButton("No",
            DialogInterface.OnClickListener { dialog, which -> //if user select "No", just cancel this dialog and continue with app
                dialog.cancel()
            })
        val alert: android.app.AlertDialog? = builder.create()
        alert?.show()
    }
}