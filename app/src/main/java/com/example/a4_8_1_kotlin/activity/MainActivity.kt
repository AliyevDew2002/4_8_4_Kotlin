package com.example.a4_8_1_kotlin.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.a4_8_4_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        var view: View =binding.root
        setContentView(view)
        initViews()
    }

    fun initViews(){
        binding.mainBt.setOnClickListener{
            openViewPager()
        }
    }
    fun openViewPager(){
        var intent:Intent=Intent(this,ViewPager::class.java)
        startActivity(intent)
    }

}