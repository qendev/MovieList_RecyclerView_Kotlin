package com.example.movielist_recyclerview_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fragments.MainFragment

class MainActivity : SingleFragmentActivity() {
    override fun createFragment() = MainFragment.newInstance()
}