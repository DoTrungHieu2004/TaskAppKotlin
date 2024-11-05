package com.hieu10.taskappkotlin.injection

import android.content.Context
import androidx.room.Room
import com.hieu10.taskappkotlin.data.TaskDB
import com.hieu10.taskappkotlin.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DBModule {
    @Singleton
    @Provides
    fun provideDB(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        TaskDB::class.java,
        Constants.DB_NAME
    ).build()

    @Singleton
    @Provides
    fun provideDAO(database: TaskDB) = database.taskDAO()
}