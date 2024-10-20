package com.palacin.kenny.laboratoriocalificado02

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.palacin.kenny.laboratoriocalificado02.databinding.ActivityEjercicio01Binding

class Ejercicio01 : AppCompatActivity() {
    private lateinit var binding: ActivityEjercicio01Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityEjercicio01Binding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnMostrar.setOnClickListener {
            binding.greenArea.visibility = View.VISIBLE
        }

        binding.btnOcultar.setOnClickListener {
            binding.greenArea.visibility = View.GONE
        }
    }
}