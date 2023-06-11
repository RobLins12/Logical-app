package com.example.logical_app.study.conceitos_basicos_3

import android.widget.Button
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Assunto3ViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Criando nova viewModel"
    }
    val text: LiveData<String> = _text
}