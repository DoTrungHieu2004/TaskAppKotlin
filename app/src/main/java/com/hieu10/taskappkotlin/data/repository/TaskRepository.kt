package com.hieu10.taskappkotlin.data.repository

import com.hieu10.taskappkotlin.data.TaskDAO
import com.hieu10.taskappkotlin.data.models.Task
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class TaskRepository @Inject constructor(private val taskDAO: TaskDAO) {
    val getAllTasks: Flow<List<Task>> = taskDAO.getAllTasks()
    val sortByLowPriority: Flow<List<Task>> = taskDAO.sortByLowPriority()
    val sortByHighPriority: Flow<List<Task>> = taskDAO.sortByHighPriority()

    fun getSelectedTasks(taskId: Int): Flow<Task> {
        return taskDAO.getSelectedTask(taskId)
    }

    suspend fun addTask(task: Task) {
        taskDAO.addTask(task = task)
    }

    suspend fun updateTask(task: Task) {
        taskDAO.updateTask(task = task)
    }

    suspend fun deleteTask(task: Task) {
        taskDAO.deleteTask(task = task)
    }

    suspend fun deleteAllTasks() {
        taskDAO.deleteAllTasks()
    }

    fun searchDatabase(searchQuery: String): Flow<List<Task>> {
        return taskDAO.searchDatabase(searchQuery = searchQuery)
    }
}