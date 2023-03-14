package com.ocean.android_kotlin_participacao_ocean_13_a_15_03_2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btEnviar: Button = findViewById(R.id.btEnviar)
        val btLimpar: Button = findViewById(R.id.btLimpar)

        val tvResultado: TextView = findViewById(R.id.tvResultado)
        val etNome: EditText = findViewById(R.id.etNome)

        btEnviar.setOnClickListener {
            if (!etNome.text.isEmpty()){
                tvResultado.text = etNome.text
            }else{
                tvResultado.text = "Campo em branco!"
            }

        }
        btLimpar.setOnClickListener {
            if (!etNome.text.isEmpty()){
                etNome.text = null
            }
            tvResultado.text = ""

        }
    }
}