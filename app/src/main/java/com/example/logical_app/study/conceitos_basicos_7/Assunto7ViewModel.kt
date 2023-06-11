package com.example.logical_app.study.conceitos_basicos_7

import android.annotation.SuppressLint
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Assunto7ViewModel : ViewModel() {
    @SuppressLint("SuspiciousIndentation")
    private val _text = MutableLiveData<String>().apply {
        value ="\nDisjunção (v): É a operação cujo valor lógico é verdade quando pelo menos uma proposição é verdadeira. Tem a seguinte notação: p ou q (p ˅ q).\n"+
                "\np: Paris é a capital da França;" +
                "\nq: 9 - 4 = 5.\n" +
                "V(p ˅ q) = V(p) ˅ V(q) = V ˅ V = V\n"+
                "\np: Recife é a capital do Brasil;\n" +
                "\nq: 7 é um nº primo.\n" +
                "V(p ˅ q) = V(p) ˅ V(q) = F ˅ V = V"+
                "\np: a copa da Rússia foi em 2014;\n" +
                "q: \uD835\uDED1 = 4 .\n" +
                "V(p ˅ q) = V(p) ˅ V(q) = F ˅ F = F \n"
    }
    val text: LiveData<String> = _text
}