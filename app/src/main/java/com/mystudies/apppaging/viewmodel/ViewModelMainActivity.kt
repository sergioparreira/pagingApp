package com.mystudies.apppaging.viewmodel

import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.room.Room
import com.mystudies.apppaging.database.DataBase
import com.mystudies.apppaging.entity.Notice
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


    fun insertNotices(context: Context) {
        viewModelScope.launch {
            try {
                withContext(Dispatchers.IO) {
                    val db = Room.databaseBuilder(
                        context,
                        DataBase::class.java, "paging-database"
                    ).build()
                    //  val listNotice = mutableListOf<Notice>()
                    repeat(20) {
                        //listNotice.add(Notice(it.toLong(), "Teste $it", "teste $it teste $it"))
                        db.noticeDao()
                            .insertAll(Notice(it.toLong(), "Teste $it", "teste $it teste $it"))
                    }
                }
            } catch (e: Exception) {
                Log.e("ERROLOAD", "${e.message} - message")
            }
        }
    }


    private fun getUsersToInsert() {

    }

}