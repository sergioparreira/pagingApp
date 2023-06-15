package com.mystudies.apppaging.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.mystudies.apppaging.databinding.ActivityMainBinding
import com.mystudies.apppaging.viewmodel.ViewModelMainActivity

class MainActivity : AppCompatActivity() {

    private lateinit var mViewBinding: ActivityMainBinding
    private val mViewModel: ViewModelMainActivity by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mViewBinding.root)
        mViewModel.insertNotices(this)
    }


}