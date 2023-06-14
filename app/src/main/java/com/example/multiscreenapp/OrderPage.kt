package com.example.multiscreenapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class OrderPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_page)
        val orderOfCustomer = intent.getStringExtra(MainActivity.KEY)
        val order = findViewById<TextView>(R.id.tVOrder)
         order.text= "Order Placed for "+orderOfCustomer.toString()

    }
}