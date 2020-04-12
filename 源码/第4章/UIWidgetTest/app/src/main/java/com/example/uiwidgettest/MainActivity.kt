package com.example.uiwidgettest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button -> {
//                val inputText = editText.text.toString()
//                Toast.makeText(this, inputText, Toast.LENGTH_SHORT).show()

//                imageView.setImageResource(R.drawable.img_2)

//                if (progressBar.visibility == View.VISIBLE) {
//                    progressBar.visibility = View.GONE
//                } else {
//                    progressBar.visibility = View.VISIBLE
//                }

//                progressBar.progress = progressBar.progress + 10

                val dialog = AlertDialog.Builder(this).run {
                    setTitle("This is Dialog")
                    setMessage("Something important.")
                    setCancelable(false)
                    setPositiveButton("OK") { dialog, which ->
                    }
                    setNegativeButton("Cancel") { dialog, which ->
                    }
                    create()
                }
                dialog.show()
            }
        }
    }

}
