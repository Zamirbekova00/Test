package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val math = Math()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListener()
    }

    private fun initListener() {
        binding.apply {
            btnAdd.setOnClickListener {
                tvResult.text = math.add(etFirstNumber.text.toString(), etSecondNumber.text.toString())
            }
            btnDivide.setOnClickListener {
                tvResult.text = math.divide(etFirstNumber.text.toString(), etSecondNumber.text.toString())
            }
        }
    }
}