package com.ab.twoactivities

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ReceivedMessageActivity : AppCompatActivity() {
    private lateinit var messageTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_received_message)

        messageTextView = findViewById(R.id.textViewReceivedMsg)

        val message = intent.getStringExtra("message")
        messageTextView.text = message
    }
}