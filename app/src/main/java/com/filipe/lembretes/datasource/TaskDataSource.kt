package com.filipe.lembretes.datasource

import com.filipe.lembretes.model.Task

object TaskDataSource {
    private val list = arrayListOf<Task>()

    fun getList() = list.toList()

    fun insertTask(task: Task){
        list.add(task.copy(id = list.size + 1))
    }
    fun findById (taskId: Int){
        list.find{ it.id == taskId }
    }
}