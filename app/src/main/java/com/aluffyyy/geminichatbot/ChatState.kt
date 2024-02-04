package com.aluffyyy.geminichatbot

import android.graphics.Bitmap
import com.aluffyyy.geminichatbot.data.Chat

data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)