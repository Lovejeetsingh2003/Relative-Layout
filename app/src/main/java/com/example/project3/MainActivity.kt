package com.example.project3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var tvNumber : TextView
    lateinit var btnMinus : Button
    lateinit var btnPlus :Button
    lateinit var btnMulti : Button
    lateinit var btnDivide : Button
    lateinit var btnReset : Button
    var number = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvNumber = findViewById(R.id.tvNumber)
        btnMinus = findViewById(R.id.btnMinus)
        btnMulti = findViewById(R.id.btnMulti)
        btnPlus = findViewById(R.id.btnPlus)
        btnDivide = findViewById(R.id.btnDivide)
        btnReset = findViewById(R.id.btnReset)

       tvNumber.text = number.toString()
        btnMinus.setOnClickListener {
            number -= 2
            tvNumber.text = number.toString()
        }
        btnPlus.setOnClickListener {
            number += 2
            tvNumber.text = number.toString()
        }
        btnMulti.setOnClickListener {
            number *= 2
            tvNumber.text = number.toString()
        }
        btnDivide.setOnClickListener {
            number /= 2
            tvNumber.text = number.toString()
        }
        btnReset.setOnClickListener {
            number = 0
            tvNumber.text = number.toString()
        }
    }
}