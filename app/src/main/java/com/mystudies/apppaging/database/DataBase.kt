package com.mystudies.apppaging.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mystudies.apppaging.entity.Note
import com.mystudies.apppaging.interfaces.NoticeDao


@Database(entities = [Note::class], version = 1)
abstract class DataBase : RoomDatabase() {

    abstract fun noticeDao(): NoticeDao

}