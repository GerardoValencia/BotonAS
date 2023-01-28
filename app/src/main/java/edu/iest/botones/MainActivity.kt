package edu.iest.botones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var tvFrase : TextView
    private lateinit var etFrase : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvFrase = findViewById(R.id.textViewFrase)
        etFrase = findViewById(R.id.editTextFrase)
        var bnMostrar = findViewById<Button>(R.id.buttonMostrar)
        bnMostrar.setOnClickListener{
            var frase = getFrase()
            Snackbar.make(tvFrase, "Su frase fue $frase", Snackbar.LENGTH_LONG).show()
        }
        var bnSiguiente = findViewById<Button>(R.id.bnSiguiente)
        bnSiguiente.setOnClickListener{
            var i = Intent(this, SegundaActivity::class.java)
            i.putExtra("Frase", getFrase())
            i.putExtra("Edad", 21)
            startActivity(i)
            finish()
        }
    }
    private fun getFrase() : String{
        return etFrase.text.toString()
    }
}