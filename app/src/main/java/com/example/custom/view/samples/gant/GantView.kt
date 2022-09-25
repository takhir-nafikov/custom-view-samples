package com.example.custom.view.samples.gant

import android.content.Context
import android.util.AttributeSet
import android.view.View
import java.time.LocalDate

class GantView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {


    private var tasks: List<Task> = emptyList()

    fun setTasks(tasks: List<Task>) {
        if (tasks != this.tasks) {
            this.tasks = tasks

            // Сообщаем, что нужно пересчитать размеры
            requestLayout()
            // Сообщаем, что нужно перерисовать
            invalidate()
        }
    }
}

data class Task(
    val name: String,
    val dateStart: LocalDate,
    val dataEnd: LocalDate
)