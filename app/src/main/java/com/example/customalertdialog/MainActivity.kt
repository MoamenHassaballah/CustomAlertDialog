package com.example.customalertdialog

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        showCustomDialog()
    }

    fun showCustomDialog(){

        val dialog = Dialog(this)

        val view = layoutInflater.inflate(R.layout.custom_dialog_layout, null)


        val button = view.findViewById<Button>(R.id.dismiss)
        button.setOnClickListener {
            dialog.dismiss()
        }

        dialog.setContentView(view)


        dialog.show()

    }
}