package ru.glomadov.univerproject.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HolidaysViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Holidays Fragment"
    }
    val text: LiveData<String> = _text
}