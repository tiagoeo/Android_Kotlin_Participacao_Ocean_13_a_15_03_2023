package com.ocean.android_kotlin_participacao_ocean_13_a_15_03_2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val btVoltar: Button = findViewById(R.id.btVoltar)

        btVoltar.setOnClickListener {
            finish()
        }
    }
}