package com.example.logical_app.study.conceitos_basicos_2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Assunto2ViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Bem-vindo ao assunto de proposições logicas"
    }
    val text: LiveData<String> = _text
}