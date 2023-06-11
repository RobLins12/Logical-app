package com.example.logical_app.study.conceitos_basicos_5

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Assunto5ViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value ="Conectivos:\n"+"São termos que são usados para combinar proposições para formar novas proposições mais complexas. Eles são usados para expressar relações lógicas entre proposições, como negação, conjunção, disjunção, implicação e equivalência.\n"+
                "São eles:\n" +
                "e;\n" +
                "ou;\n" +
                "não;\n" +
                "se então;\n" +
                "se somente se \n"+
                "\nExemplos\n"+
                "P:Pedro é estudante de computação e João \té estudante de engenharia civil.\n" +
                "\tQ : Maria é administradora ou economista.\n"+
                "\tR : Não está chovendo"

    }
    val text: LiveData<String> = _text
}