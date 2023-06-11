package com.example.logical_app.study.conceitos_basicos_8

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Assunto8ViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "\nTabela verdade: É uma tabela que mostra todas as combinações possíveis de valores de verdade para as proposições envolvidas em uma expressão lógica. \n"+
                "\nTabela verdade Negação:\n"+
                "\np | ~p |\n"+
                "V | F  |\n"+
                "\nTabela verdade Conjunção:\n"+
                "\np | q | p ^ q\n"+
                "V | V | V\n"+
                "V | F | F\n"+
                "F | V | F\n"+
                "F | F | F\n"+
                "\nTabela verdade Conjunção:\n"+
                "\np | q | p ˅ q\n"+
                "V | V | V\n"+
                "V | F | V\n"+
                "F | V | V\n"+
                "F | F | F\n"

    }
    val text: LiveData<String> = _text
}