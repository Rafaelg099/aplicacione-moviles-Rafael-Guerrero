package com.example.finalgrade

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nota1 = findViewById<EditText>( R.id.nota1)
        val nota2 = findViewById<EditText>(R.id.nota2)
        val nota3 = findViewById<EditText>(R.id.nota3)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val btnLimpiar = findViewById<Button>(R.id.btnLimpiar)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        val n1 = nota1.text.toString().toDoubleOrNull()?:0.0
        val n2 = nota2.text.toString().toDoubleOrNull()?:0.0
        val n3 = nota3.text.toString().toDoubleOrNull()?:0.0

        btnCalcular.setOnClickListener {

            val promedio = (n1 + n2 + n3) / 3
            val mensaje = if (promedio >= 3.0) {
                "promedio: %.2f Aprobado".format(promedio)
            } else{
                "promedio: %.2f Reprobado".format(promedio)
            }
            txtResultado.text = mensaje
        }

        btnLimpiar.setOnClickListener {
            nota1.Text.clear()
            nota2.Text.clear()
            nota3.Text.clear()
            txtResultado.Text = ""

    }
}