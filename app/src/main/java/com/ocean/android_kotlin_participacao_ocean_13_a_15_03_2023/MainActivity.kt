package com.ocean.android_kotlin_participacao_ocean_13_a_15_03_2023

import android.content.Intent
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
        val btAbrirNovaTela: Button = findViewById(R.id.btAbrirNovaTela)

        val tvResultado: TextView = findViewById(R.id.tvResultado)
        val etNome: EditText = findViewById(R.id.etNome)

        btEnviar.setOnClickListener {
            if (etNome.text.isBlank()){
                etNome.error = getString(R.string.insert_a_valid_name)

            }else{
                tvResultado.text = etNome.text
            }

        }

        btLimpar.setOnClickListener {
            if (!etNome.text.isEmpty()){
                etNome.text = null
            }
            tvResultado.text = ""

        }

        btAbrirNovaTela.setOnClickListener {
            val novaTelaIntent = Intent(this, ResultadoActivity::class.java)
            val nomeDigitado: String = etNome.text.toString()

            novaTelaIntent.putExtra("NOME_DIGITADO", nomeDigitado)

            startActivity(novaTelaIntent)
        }
    }
}