package edu.iest.botones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView

class SegundaActivity : AppCompatActivity(){

    private var cambioIcono: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        var fraseRecibida = intent.getStringExtra("Frase")
        var edad = intent.getIntExtra("Edad", 0)

        Log.d("DATOS", "Datos recibidos con exito fueron frase $fraseRecibida y edad $edad")

        var bnAbrirPantalla = findViewById<Button>(R.id.bnPantalla)
        var ivLogo = findViewById<ImageView>(R.id.ivLogo)
        ivLogo.setOnClickListener {
            var arregloImagenes = arrayOf<Int>(R.drawable.anahuac, R.drawable.iest)
            if (cambioIcono) {
                ivLogo.setImageResource(arregloImagenes[0])
            } else {
                ivLogo.setImageResource(arregloImagenes[1])
            }
            cambioIcono = !cambioIcono
        }

        bnAbrirPantalla.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            finish()
        }
        var bnCerrar = findViewById<Button>(R.id.bnCerrar)
        bnCerrar.setOnClickListener {
            finish()
        }
        //bnCerrar.setOnClickListener(this)
    }
}

    /*override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.bnCerrar -> finish()
            R.id.bnPantalla -> {

            }
        }
    }
}*/