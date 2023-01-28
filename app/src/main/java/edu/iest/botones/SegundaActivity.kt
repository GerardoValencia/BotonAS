package edu.iest.botones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        var fraseRecibida = intent.getStringExtra("Frase")
        var edad = intent.getIntExtra("Edad", 0)

        Log.d("DATOS", "Datos recibidos con exito fueron frase $fraseRecibida y edad $edad")

        var bnAbrirPantalla = findViewById<Button>(R.id.bnPantalla)
        bnAbrirPantalla.setOnClickListener{
            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
            finish()
        }
        var bnCerrar = findViewById<Button>(R.id.bnCerrar)
        bnCerrar.setOnClickListener{
            finish()
        }
    }
}