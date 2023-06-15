package com.mystudies.apppaging.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
    @PrimaryKey(autoGenerate = true) val id: Long,
    @ColumnInfo(name = "title") val title: String?,
    @ColumnInfo(name = "msg_notice") val msgNotice: String?
)