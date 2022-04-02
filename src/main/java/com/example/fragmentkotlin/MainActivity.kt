package com.example.fragmentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flfragment, firstFragment)
            commit()
        }

        val btnFirstFragment = findViewById<Button>(R.id.btnFirstFragment)

        btnFirstFragment.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment, firstFragment)
                addToBackStack(null)
                commit()
            }
        }

        val btnSecondFragment = findViewById<Button>(R.id.btnSecondFragment)

        btnSecondFragment.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment, secondFragment)
                addToBackStack(null)
                commit()
            }
        }
    }
}