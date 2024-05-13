package com.ab.twoactivities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class CreateMessageActivity : AppCompatActivity() {
    private lateinit var messageEditText: EditText
    private lateinit var sendButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_message)

        messageEditText = findViewById(R.id.editTextMessage)
        sendButton = findViewById(R.id.sendMessageButton)

        sendButton.setOnClickListener {
            val message = messageEditText.text.toString()
            if (message.isNotEmpty()) {
                val intent = Intent(this, ReceivedMessageActivity::class.java)
                intent.putExtra("message", message)
                startActivity(intent)
            }
        }
    }
}