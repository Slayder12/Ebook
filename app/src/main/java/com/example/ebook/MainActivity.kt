package com.example.ebook

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var downloadBTN: Button
    private lateinit var textTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textTV = findViewById(R.id.textTV)
        downloadBTN = findViewById(R.id.downloadBTN)

        downloadBTN.setOnClickListener {
            textTV.text = ""
            val book = loadBook(Database().text)
            for (line in book){
                textTV.append("$line ")
            }
        }

    }
    private fun loadBook(text: String): List<String> {
        return text.split(" ")
    }
}