package com.filipe.lembretes.ui

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.filipe.lembretes.databinding.ActivityAddTaskBinding
import com.filipe.lembretes.extesions.format
import com.filipe.lembretes.extesions.text
import com.google.android.material.datepicker.MaterialDatePicker
import com.google.android.material.timepicker.MaterialTimePicker
import java.util.*

class AddTaskActivity: AppCompatActivity() {

    private lateinit var binding: ActivityAddTaskBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityAddTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)

        insertListeners()

    }

        private fun insertListeners(){
            binding.tilDate.editText?.setOnClickListener {
                val datePicker = MaterialDatePicker.Builder.datePicker().build()
                datePicker.addOnPositiveButtonClickListener {
                    val timeZone = TimeZone.getDefault()
                    val offset = timeZone.getOffset(Date().time) * -1
                    binding.tilDate.text = Date(it + offset).format()
                }
                datePicker.show(supportFragmentManager, "DATE_PICKER_TAG")
            }
            binding.tilClock.editText?.setOnClickListener{
                val timePicker = MaterialTimePicker.Builder().build()
                    timePicker.addOnPositiveButtonClickListener {

                    }
                timePicker.show(supportFragmentManager, null)
            }
        }
}