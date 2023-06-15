package com.mystudies.apppaging.interfaces

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.mystudies.apppaging.entity.Notice

@Dao
interface NoticeDao {


    @Query("SELECT * FROM notice")
    suspend fun getAllNotices(): MutableList<Notice>

    @Insert
    fun insertAll(vararg users: Notice)

}