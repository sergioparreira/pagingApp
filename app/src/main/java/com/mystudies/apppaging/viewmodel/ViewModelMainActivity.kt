package com.mystudies.apppaging.viewmodel

import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.room.Room
import com.mystudies.apppaging.database.DataBase
import com.mystudies.apppaging.entity.Note
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ViewModelMainActivity : ViewModel() {

    fun loadNotices(context: Context) {
        viewModelScope.launch {
            try {
                withContext(Dispatchers.IO) {
                    val db = Room.databaseBuilder(
                        context,
                        DataBase::class.java, "paging-database"
                    ).build()

                    db.noticeDao().getAllNotices()
                }
            } catch (e: Exception) {
                Log.e("ERROLOAD", "${e.message} - message")
            }
        }
    }


    fun insertNote(context: Context, note: Note) {
        viewModelScope.launch {
            try {
                withContext(Dispatchers.IO) {
                    val db = Room.databaseBuilder(
                        context,
                        DataBase::class.java, "paging-database"
                    ).build()
                    db.noticeDao().insertAll(note)
                }
            } catch (e: Exception) {
                Log.e("ERROLOAD", "${e.message} - message")
            }
        }
    }


    private fun getUsersToInsert() {

    }

}