package com.example.eletriccarapp.ui

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.eletriccarapp.R

class CalcularAutonomiaActivity : AppCompatActivity(){

    lateinit var preco: EditText
    lateinit var kmPercorrido: EditText
    lateinit var resultado: TextView
    lateinit var btnCalcular: Button

    lateinit var btnClose: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcular_autonomia )

    setupView()
    setupListeners()

    }

    fun setupView(){

        preco = findViewById<EditText>(R.id.et_preco_kwh)
        kmPercorrido = findViewById<EditText>(R.id.et_km_percorrido)
        resultado = findViewById<TextView>(R.id.tv_resultado)
        btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnClose = findViewById<ImageView>(R.id.iv_close)
    }

    fun setupListeners(){
        btnCalcular.setOnClickListener {
            calcular()
        }

        btnClose.setOnClickListener {
            finish()
        }
    }

    fun calcular(){
        val preco = preco.text.toString().toFloat()
        val km = kmPercorrido.text.toString().toFloat()
        val result = preco / km

        resultado.text = result.toString()
    }

}