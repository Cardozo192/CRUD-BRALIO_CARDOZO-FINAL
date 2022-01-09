package dev.cardoso.quotesmvvm.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import dev.cardoso.quotesmvvm.R

class SlideshowViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "ESTO ES LA PLATILLA DE AGREGAR "
    }
    val text: LiveData<String> = _text
}