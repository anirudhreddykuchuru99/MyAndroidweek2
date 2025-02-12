package com.action.myandroidweek2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.action.myandroidweek2.R.*
import com.action.myandroidweek2.hw.RecyclerAdapter
import com.action.myandroidweek2.hw.hw.ProductRepository

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        val recyclerView: RecyclerView = findViewById(id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val productList = ProductRepository.getProducts()
        recyclerView.adapter = RecyclerAdapter(productList)

        Toast.makeText(this, "Welcome to the Muffin Store!", Toast.LENGTH_LONG).show()
    }
}