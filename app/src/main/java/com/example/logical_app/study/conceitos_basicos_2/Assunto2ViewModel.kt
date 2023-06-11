package com.example.logical_app.study.conceitos_basicos_2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Assunto2ViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Há alguns tipos de lógica como, lógica proposicional e de predicados.\n" +
                "\n A lógica proposicional é quando estudamos relações existentes entre proposições verdadeiras e falsas.\n" +
                "\nEx.: 2 != 5 = verdadeiro\n" +
                "\nEx.2: 3 < 1 = falso\n"+
                "\nEssa lógica é bastante usada na computação, principalmente quando criar blocos de condicionais para verificar se instrução é verdadeira ou não.\n"+
                "\nA lógica de predicado é quando queremos estudar os raciocínios de forma simbólica considerando informações sobre o sujeito da expressão ou da sentença proposta.\n" +
                "\nÉ uma estrutura mais complexa que a proposicional, que lida com conectivos e proposições simples.\n" +
                "Esse tipo de lógica, no contexto da computação é usada para o desenvolvimento de IA, onde podemos descrever o mundo em termos de objetos, propriedades, relações e restrições, fornecendo uma base lógica para o raciocínio automatizado e a tomada de decisões."
    }
    val text: LiveData<String> = _text
}