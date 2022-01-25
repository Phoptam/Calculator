package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button32.setOnClickListener {
            textView2.setText("0")
        }
        button36.setOnClickListener {
            if (textView2.text == "0") {
                textView2.setText("")
                textView2.setText(textView2.text.toString() + "7")
            } else {
                textView2.setText(textView2.text.toString() + "7")
            }
        }
        button37.setOnClickListener {
            if (textView2.text == "0") {
                textView2.setText("")
                textView2.setText(textView2.text.toString() + "8")
            } else {
                textView2.setText(textView2.text.toString() + "8")
            }
        }
        button38.setOnClickListener {
            if (textView2.text == "0") {
                textView2.setText("")
                textView2.setText(textView2.text.toString() + "9")
            } else {
                textView2.setText(textView2.text.toString() + "9")
            }
        }
        button40.setOnClickListener {
            if (textView2.text == "0") {
                textView2.setText("")
                textView2.setText(textView2.text.toString() + "4")
            } else {
                textView2.setText(textView2.text.toString() + "4")
            }
        }
        button41.setOnClickListener {
            if (textView2.text == "0") {
                textView2.setText("")
                textView2.setText(textView2.text.toString() + "5")
            } else {
                textView2.setText(textView2.text.toString() + "5")
            }
        }
        button53.setOnClickListener {
            if (textView2.text == "0") {
                textView2.setText("")
                textView2.setText(textView2.text.toString() + "6")
            } else {
                textView2.setText(textView2.text.toString() + "6")
            }
        }
        button44.setOnClickListener {
            if (textView2.text == "0") {
                textView2.setText("")
                textView2.setText(textView2.text.toString() + "1")
            } else {
                textView2.setText(textView2.text.toString() + "1")
            }
        }
        button45.setOnClickListener {
            if (textView2.text == "0") {
                textView2.setText("")
                textView2.setText(textView2.text.toString() + "2")
            } else {
                textView2.setText(textView2.text.toString() + "2")
            }
        }
        button46.setOnClickListener {
            if (textView2.text == "0") {
                textView2.setText("")
                textView2.setText(textView2.text.toString() + "3")
            } else {
                textView2.setText(textView2.text.toString() + "3")
            }
        }
        button48.setOnClickListener {
            if (textView2.text == "0") {
                textView2.setText("0")
            } else {
                textView2.setText(textView2.text.toString() + "0")
            }
        }
        button33.setOnClickListener {
            if (textView2.text == "0" || textView2.text.length.toString() == "1") {
                textView2.setText("0")
            } else {
                textView2.setText(textView2.text.toString().dropLast(1))
            }
        }
    }
}