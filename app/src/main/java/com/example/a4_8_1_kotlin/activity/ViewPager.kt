package com.example.a4_8_1_kotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.a4_8_1_kotlin.adapter.ViewPagerAdapter
import com.example.a4_8_1_kotlin.fragment.FirstFragment
import com.example.a4_8_1_kotlin.fragment.SecondFragment
import com.example.a4_8_4_kotlin.databinding.ActivityViewPagerBinding

class ViewPager : AppCompatActivity() {

    lateinit var bindingPager: ActivityViewPagerBinding
    lateinit var viewPagerAdapter:ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingPager= ActivityViewPagerBinding.inflate(layoutInflater)
        var view: View =bindingPager.root
        setContentView(view)
        initViews()
    }
    fun initViews(){
        viewPagerAdapter =ViewPagerAdapter(supportFragmentManager)
        viewPagerAdapter.add(FirstFragment(),"PAGE 1")
        viewPagerAdapter.add(SecondFragment(),"PAGE 2")
        bindingPager.viewpager.adapter=viewPagerAdapter
        bindingPager.tablayout.setupWithViewPager(bindingPager.viewpager)
    }
}