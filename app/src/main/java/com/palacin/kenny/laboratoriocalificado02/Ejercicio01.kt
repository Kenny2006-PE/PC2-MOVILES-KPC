package com.palacin.kenny.laboratoriocalificado02

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.palacin.kenny.laboratoriocalificado02.databinding.ActivityEjercicio01Binding

class Ejercicio01 : AppCompatActivity() {
    // Variable para el binding
    private lateinit var binding: ActivityEjercicio01Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Inicializando el binding
        binding = ActivityEjercicio01Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configuración de padding para evitar solapamiento con la barra del sistema
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Botón Mostrar - Cambia la visibilidad del área verde a VISIBLE
        binding.btnMostrar.setOnClickListener {
            binding.greenArea.visibility = View.VISIBLE
        }

        // Botón Ocultar - Cambia la visibilidad del área verde a GONE
        binding.btnOcultar.setOnClickListener {
            binding.greenArea.visibility = View.GONE
        }
    }
}