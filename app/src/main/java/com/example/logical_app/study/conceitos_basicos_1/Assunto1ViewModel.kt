package com.example.logical_app.study.conceitos_basicos_1

import android.widget.Button
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Assunto1ViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "A lógica matemática é uma área da matemática importante não apenas para as pessoas que cursam nas áreas da computação e engenharia, mas sim para todas as áreas, pois ela busca estabelecer uma base sólida para o raciocínio matemático, definindo regras e princípios para a manipulação correta de símbolos e proposições. \n" +
                "\nNa estrutura básica de um raciocínio lógico, há 3 componentes que forma o raciocínio lógico.\n" +
                "\n1. Premissa: Princípio ou informações que dá base ao raciocínio\n" +
                "\n2. Arumento: É o raciocínio que conduz à dedução de algo.\n" +
                "\n3. Proposição: É a conclusão do argumento. Ele pode ser verdadeiro (v) ou falso (f).\n"
    }
    val text: LiveData<String> = _text
}