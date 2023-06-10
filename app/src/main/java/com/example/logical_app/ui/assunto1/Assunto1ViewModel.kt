package com.example.logical_app.ui.assunto1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Assunto1ViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Bem-vindo ao assunto de tabela da verdade"
    }
    val text: LiveData<String> = _text
}