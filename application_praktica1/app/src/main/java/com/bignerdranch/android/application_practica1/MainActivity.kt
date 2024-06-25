package com.bignerdranch.android.application_practica1

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.bignerdranch.android.application_practica1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)

        var count = 0
        binding.replaceFragment.setOnClickListener {
            if (count == 0)
            {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.FramePlace, BlankFragment.newInstance())
                    .commit()
                count++
            }
            else
            {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.FramePlace, BlankFragment2.newInstance())
                    .commit()
                count = 0
            }

        }


        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

}