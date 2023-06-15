package com.mystudies.apppaging.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import com.mystudies.apppaging.adapter.AdapterNote
import com.mystudies.apppaging.databinding.ActivityMainBinding
import com.mystudies.apppaging.entity.Note
import com.mystudies.apppaging.viewmodel.ViewModelMainActivity
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    private lateinit var mActivityViewBinding: ActivityMainBinding
    private val mViewModel: ViewModelMainActivity by viewModels()
    private var adapterNote: AdapterNote = AdapterNote(this, arrayListOf())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mActivityViewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mActivityViewBinding.root)
        configurarRecyclerView()
        onClick()
    }

    private fun configurarRecyclerView() {
        mActivityViewBinding.recyclerViewNotices.setHasFixedSize(false)
        mActivityViewBinding.recyclerViewNotices.layoutManager =
            GridLayoutManager(this@MainActivity, 1)
        mActivityViewBinding.recyclerViewNotices.itemAnimator = DefaultItemAnimator()
        mActivityViewBinding.recyclerViewNotices.adapter = adapterNote
    }

    private fun addNote() {
        try {
            val note = Note(1, "TESTE", "TESTE NOTE ")
            adapterNote.addItem(note)
        } catch (e: Exception) {
            Toast.makeText(this, "${e.message}", Toast.LENGTH_LONG).show()
        }
    }

    private fun onClick() {
        mActivityViewBinding.buttonAddNote.setOnClickListener {
            addNote()
        }
    }

}