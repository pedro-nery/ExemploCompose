package com.picpay.composePicpay.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ComponentViewModel : ViewModel() {

    private val _isLoading = mutableStateOf(true)
    var isLoading : State<Boolean> = _isLoading

    private val _response = mutableStateOf("")
    var response : State<String> = _response

    private val _error = mutableStateOf(false)
    var error : State<Boolean> = _error

    fun callService(){
        viewModelScope.launch {
            delay(5000)
            _isLoading.value = false
            _error.value = false
            _response.value = "Pedro"
        }
    }

}