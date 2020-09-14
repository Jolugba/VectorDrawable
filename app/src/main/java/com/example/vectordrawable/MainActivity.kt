package com.example.vectordrawable

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.vectordrawable.databinding.ActivityMainBinding
import com.example.vectordrawable.databinding.ToolbarViewsBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ToolbarViewsBinding
    private lateinit var activityMainBinding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding= DataBindingUtil.setContentView(this, R.layout.activity_main)



        //inflate appbar layout and attach it to toolbar
        binding=DataBindingUtil.inflate(
            layoutInflater,
            R.layout.toolbar_views,
            activityMainBinding.toolbar,
            false
        )
        activityMainBinding.toolbar.addView(binding.root)







    }
}