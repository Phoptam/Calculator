package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a = ""
        var b = 0
        var c = ""
        var d : Double = 0.0
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
        button49.setOnClickListener {
            if (!textView2.text.toString().contains(".")) {
                textView2.text = textView2.text.toString() + "."
            }
        }
        button35.setOnClickListener {
            c = "/"
            a = textView2.text.toString()
            textView2.setText("0")
        }
        button39.setOnClickListener {
            c = "x"
            a = textView2.text.toString()
            textView2.setText("0")
        }
        button54.setOnClickListener {
            c = "-"
            a = textView2.text.toString()
            textView2.setText("0")
        }
        button47.setOnClickListener {
            c = "+"
            a = textView2.text.toString()
            textView2.setText("0")
        }
        button34.setOnClickListener {
            c = "%"
            a = textView2.text.toString()
            textView2.setText("0")
        }
        button50.setOnClickListener {
            if (c == "/") {
                d = (a.toString().toDouble() / textView2.text.toString().toDouble())
                textView2.setText(d.toString())
            } else if (c == "x") {
                d = (a.toString().toDouble() * textView2.text.toString().toDouble())
                textView2.setText(d.toString())
            } else if (c == "-") {
                d = (a.toString().toDouble() - textView2.text.toString().toDouble())
                textView2.setText(d.toString())
            } else if (c == "+") {
                d = (a.toString().toDouble() + textView2.text.toString().toDouble())
                textView2.setText(d.toString())
            }else if (c == "%") {
                d = (a.toString().toDouble() % textView2.text.toString().toDouble())
                textView2.setText(d.toString())
            }
        }
    }
}