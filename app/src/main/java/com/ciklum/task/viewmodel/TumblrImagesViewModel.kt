package com.ciklum.task.viewmodel

import android.app.Application
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ciklum.task.networking.entity.Response
import com.ciklum.task.networking.entity.TumblrResponse
import com.ciklum.task.repository.NetworkingRepository
import com.ciklum.task.ui.MainActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class TumblrImagesViewModel(
    application: Application,
    private val repository: NetworkingRepository
) : AndroidViewModel(application) {

    val imagesDataArray: ArrayList<String> = ArrayList()
    val imagesLiveData: MutableLiveData<ArrayList<String>> = MutableLiveData()

    fun makeApiCallAndSetLiveData(searchText: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val apiResponse = repository.getTumblrImages(searchText)

            for (el in apiResponse.response) {
                if (!el.photos.isNullOrEmpty()) {
                    imagesDataArray.add(el.photos[0].originalSize.url)
                }
            }

            withContext(Dispatchers.Main){
                if(imagesDataArray.isNullOrEmpty()){
                    Toast.makeText(getApplication(), "Nothing found, try another keyword!",Toast.LENGTH_SHORT).show()
                }else{
                    imagesLiveData.value = imagesDataArray
                }
            }
        }
    }
}