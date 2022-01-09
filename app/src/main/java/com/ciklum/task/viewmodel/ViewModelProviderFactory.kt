package com.ciklum.task.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ciklum.task.repository.NetworkingRepository

class ViewModelProviderFactory(
    val application: Application,
    val repository: NetworkingRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TumblrImagesViewModel(application, repository) as T
    }
}