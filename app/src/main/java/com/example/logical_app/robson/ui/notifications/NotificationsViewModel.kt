package com.example.logical_app.robson.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Graduando em Ciência da Computação pela UNICAP. Faço parte do projeto de iniciação científica Comunicação entre drone robô. Fluente em inglês"

    }
    val text: LiveData<String> = _text
}