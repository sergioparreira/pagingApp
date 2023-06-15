package com.mystudies.apppaging.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mystudies.apppaging.entity.Notice
import com.mystudies.apppaging.interfaces.NoticeDao


@Database(entities = [Notice::class], version = 1)
abstract class DataBase : RoomDatabase() {

    abstract fun noticeDao(): NoticeDao

}