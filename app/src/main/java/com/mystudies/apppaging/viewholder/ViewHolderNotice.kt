package com.mystudies.apppaging.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.mystudies.apppaging.databinding.NoteItemRvBinding
import com.mystudies.apppaging.entity.Note

class ViewHolderNotice(private val mNoteViewBinding: NoteItemRvBinding) :

    ViewHolder(mNoteViewBinding.root) {


    fun onBind(note: Note) {
        mNoteViewBinding.notaTextView.text = note.msgNotice

    }


}