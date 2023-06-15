package com.mystudies.apppaging.interfaces

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.mystudies.apppaging.entity.Note

@Dao
interface NoticeDao {


    @Query("SELECT * FROM note")
    suspend fun getAllNotices(): MutableList<Note>

    @Insert
    fun insertAll(vararg users: Note)

}