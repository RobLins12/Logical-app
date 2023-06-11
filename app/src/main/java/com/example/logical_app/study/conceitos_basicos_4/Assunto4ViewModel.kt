package com.example.logical_app.study.conceitos_basicos_4

import android.widget.Button
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Assunto4ViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value ="Axiomas\n" +
                "\n1. princípio da contradição: Uma proposição não pode ser verdadeira e nem falsa ao mesmo tempo\n" +
                "\n2. princípio do terceiro excluído: Uma proposição é verdadeira ou falsa, não há um terceiro valor.\n" +
                "\n" +
                "Exemplos:\n" +
                "\nRecife é a capital de Pernambuco\n" +
                "- 3/5 é um número inteiro\n" +

                "Há também os tipos de proposições, são elas, simples (atômica) ou composta (molecular)\n" +
                "\n" +
                "\nNa simples, só há apenas uma proposição na sua composição, exemplo:\n" +
                "\n25 é um quadrado perfeito.\n" +
                "\nJá a composta, sua estrutura possui uma combinação de duas ou mais proposições\n" +
                "\nPedro é estudante de computação e João é estudante de engenharia civil."
    }
    val text: LiveData<String> = _text
}