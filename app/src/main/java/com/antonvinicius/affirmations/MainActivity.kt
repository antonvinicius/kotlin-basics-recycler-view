package com.antonvinicius.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.antonvinicius.affirmations.adapters.AffirmationAdapter
import com.antonvinicius.affirmations.data.Datasource
import com.antonvinicius.affirmations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()

        val affirmationsDataSet = Datasource().loadAffirmations()

        binding.recyclerView.adapter = AffirmationAdapter(this, affirmationsDataSet)
        binding.recyclerView.setHasFixedSize(true)
    }
}