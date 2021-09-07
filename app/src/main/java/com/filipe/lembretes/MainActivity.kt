package com.filipe.lembretes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.filipe.lembretes.databinding.ActivityMainBinding
import com.filipe.lembretes.ui.AddTaskActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        insertListeners()
    }
    private fun insertListeners(){
        binding.btnAgendar.setOnClickListener{
            startActivity(Intent(this, AddTaskActivity::class.java))
        }
    }
}