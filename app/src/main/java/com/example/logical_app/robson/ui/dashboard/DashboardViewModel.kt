package com.example.logical_app.robson.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "E-mail: \n \nrobson.2021104910@unicap.br \n \n " + "Github: \n \n RobLins12"
    }
    val text: LiveData<String> = _text
}