package com.example.logical_app.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Nessa aba você poderá aprofundar seus conhecimentos em lógica matemática, os assuntos estão disponiveis no menu ao lado esquerdo. Bons estudos! :D"
    }
    val text: LiveData<String> = _text
}