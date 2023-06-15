package com.mystudies.apppaging.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.mystudies.apppaging.databinding.NoteItemRvBinding
import com.mystudies.apppaging.entity.Note
import com.mystudies.apppaging.viewholder.ViewHolderNotice

class AdapterNote(
    private val context: Context,
    private val listaNote: MutableList<Note> = arrayListOf()
) :
    Adapter<ViewHolderNotice>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderNotice {
        val v = NoteItemRvBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolderNotice(NoteItemRvBinding.bind(v.root))
    }

    override fun getItemCount() = listaNote.size

    override fun onBindViewHolder(holder: ViewHolderNotice, position: Int) {
        holder.onBind(listaNote[position])
    }

    fun addItem(note: Note) {
        listaNote.add(note)
        notifyItemInserted(listaNote.indexOf(note))
    }

}