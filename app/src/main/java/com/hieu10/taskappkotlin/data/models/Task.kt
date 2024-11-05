package com.hieu10.taskappkotlin.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.hieu10.taskappkotlin.utils.Constants

@Entity(tableName = Constants.DB_TABLE)
data class Task (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority
)