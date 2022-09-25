package com.example.custom.view.samples

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.custom.view.samples.gant.GantView
import com.example.custom.view.samples.gant.Task
import java.time.LocalDate

@SuppressLint("NewApi")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gantView = findViewById<GantView>(R.id.gant)
        val now = LocalDate.now()
        gantView.setTasks(
            listOf(
                Task(
                    name = "Task 1",
                    dateStart = now.minusMonths(1),
                    dateEnd = now
                ),
                Task(
                    name = "Task 2 long name",
                    dateStart = now.minusWeeks(2),
                    dateEnd = now.plusWeeks(1)
                ),
                Task(
                    name = "Task 3",
                    dateStart = now.minusMonths(2),
                    dateEnd = now.plusMonths(2)
                ),
                Task(
                    name = "Some Task 4",
                    dateStart = now.plusWeeks(2),
                    dateEnd = now.plusMonths(2).plusWeeks(1)
                ),
                Task(
                    name = "Task 5",
                    dateStart = now.minusMonths(2).minusWeeks(1),
                    dateEnd = now.plusWeeks(1)
                )
            )
        )
    }
}