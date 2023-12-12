package com.chris.practicaexamen11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.content.Intent
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {


    private lateinit var btnIngresar: Button
    private lateinit var impNamePlayer: EditText
    private lateinit var impDate: EditText
    private lateinit var impMoney: EditText
    private lateinit var impDados: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIngresar = findViewById(R.id.bottom)
        impNamePlayer = findViewById(R.id.namePlayer)
        impDate = findViewById(R.id.datePlayer)
        impMoney = findViewById(R.id.money)
        impDados = findViewById(R.id.dados)


        btnIngresar.setOnClickListener {

            val player = impNamePlayer.text.toString()
            val date = impDate.text.toString()
            val money = impMoney.text.toString()
            val dados = impDados.text.toString()

            if (dados.isEmpty() || date.isEmpty() || player.isEmpty() || money.isEmpty()){
                Toast.makeText(this, "Por favor, completa todos los campos.", Toast.LENGTH_SHORT)
                    .show()

            }else{
                val intent = Intent(this, Paginajuego::class.java)
                startActivity(intent)
            }

        }

    }
}