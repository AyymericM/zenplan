package com.example.zenplan

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class NewItemActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_item)

        val cancelBtn: TextView = findViewById(R.id.todo_cancel)
        cancelBtn.setOnClickListener {
            finish()
        }

        val openTimeDialog: TextView = findViewById(R.id.timePickerBtn)

        openTimeDialog.setOnClickListener {
            val newFragment = TimePickerFragment()
            newFragment.show(supportFragmentManager, "timePicker")
        }
    }
}
