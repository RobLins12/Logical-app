package com.example.logical_app.study.home_study

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "O nosso objetivo é te mostrar alguns dos conceitos básicos da lógica matemática."
    }
    val text: LiveData<String> = _text
}