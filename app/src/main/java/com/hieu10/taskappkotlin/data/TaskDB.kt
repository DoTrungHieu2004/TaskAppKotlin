package com.hieu10.taskappkotlin.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.hieu10.taskappkotlin.data.models.Task

@Database(entities = [Task::class], version = 1, exportSchema = false)
abstract class TaskDB: RoomDatabase() {
    abstract fun taskDAO(): TaskDAO
}