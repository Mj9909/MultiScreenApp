package com.example.multiscreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    //creating key
    companion object{
        const val KEY ="android.widget.EditText.MainActivity.KEY"
    }
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        setContentView(R.layout.activity_main)
        val btnOrder = findViewById<Button>(R.id.btnOrder)
        val e1 = findViewById<EditText>(R.id.eT1)
        val e2 = findViewById<EditText>(R.id.eT2)
        val e3 = findViewById<EditText>(R.id.eT3)
        val e4 = findViewById<EditText>(R.id.eT4)
        btnOrder.setOnClickListener {
            val ordersPlaced = e1.text.toString()+" "+e2.text.toString()+" "+
                    e3.text.toString()+" "+e4.text.toString()
            intent = Intent(this,OrderPage::class.java)
            intent.putExtra(KEY,ordersPlaced)
            startActivity(intent)
        }

    }

}