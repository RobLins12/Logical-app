package com.example.logical_app.study.conceitos_basicos_6

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Assunto6ViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value ="Operações lógicas: São procedimentos ou regras que manipulam os valores de verdade de proposições para produzir um novo valor de verdade.\n"+
                "\nNegação (~): É a negação de uma determinada proposição.  Tem a seguinte notação: ~p, ~q, ~r.\n" +
                "\nExemplos:\n"+"\tp: 2 + 3 = 5;  ~p: 2 + 3  ≠ 5. \n" +
                "\tq: 7 < 3 ;  ~q: 7 ≥ 3.\n"+
                "Conjunção (^): É a operação cujo valor lógico é verdade quando todas as proposições são verdadeiras. Tem a seguinte notação: p e q (p ^ q).\n"+
                "\nExemplos:\n"+
                "\tp: a neve é branca;  q: 2 < 5.\n" +
                "\tV(p ^ q) = V(p) ^ V(q) = V ^ V = V \n" +
                "\n" +
                "p: Recife é a capital do Brasil;\n" +
                "\tq: 7 é um nº primo.\n" +
                "\t V(p ^ q) = V(p) ^ V(q) = F ^ V = F \n"

    }
    val text: LiveData<String> = _text
}