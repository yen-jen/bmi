package com.example.bb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import com.example.bb.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ed_weight
        binding.button
    }

    fun bmi(view: View){
        val weight = ed_Weight.text.toString().toFloat()
        val height = ed_Height.text.toString().toFloat()
        val bmi = weight/(height*height)
        Log.d("BMI",bmi.toString())
    }
}