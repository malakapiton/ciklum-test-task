package com.ciklum.task.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ciklum.task.R
import com.ciklum.task.adapter.TumblrImagesAdapter
import com.ciklum.task.repository.NetworkingRepository
import com.ciklum.task.viewmodel.TumblrImagesViewModel
import com.ciklum.task.viewmodel.ViewModelProviderFactory

class MainActivity : AppCompatActivity() {

    private lateinit var searchEditText: EditText
    private lateinit var searchButton: Button
    private lateinit var tumblrImagesRecyclerView: RecyclerView
    private lateinit var tumblrViewModel: TumblrImagesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupViewModel()

        searchEditText = findViewById(R.id.search_edit_text)

        searchButton = findViewById(R.id.search_button)
        searchButton.setOnClickListener {
            searchButtonClickHandler()
        }
    }

    private fun searchButtonClickHandler() {
        if (searchEditText.text.isNotEmpty()) {
            if (!tumblrViewModel.imagesLiveData.value.isNullOrEmpty()) {
                clearViewModelData()
            }

            tumblrViewModel.makeApiCallAndSetLiveData(searchEditText.text.toString())

            tumblrViewModel.imagesLiveData.observe(this, Observer {
                setupRecyclerView(tumblrViewModel.imagesLiveData.value!!)
            })
        } else {
            Toast.makeText(
                applicationContext,
                "Search field is empty, please write something!",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun setupRecyclerView(imagesLiveData: ArrayList<String>) {
        tumblrImagesRecyclerView = findViewById(R.id.recycler_view)
        tumblrImagesRecyclerView.layoutManager = LinearLayoutManager(this)
        tumblrImagesRecyclerView.adapter =
            TumblrImagesAdapter(applicationContext, imagesLiveData) { position ->
                openDetailActivity(imagesLiveData[position])
            }
    }

    private fun setupViewModel() {
        val repository = NetworkingRepository()
        val factory = ViewModelProviderFactory(application, repository)
        tumblrViewModel = ViewModelProvider(this, factory).get(TumblrImagesViewModel::class.java)
    }

    private fun clearViewModelData() {
        tumblrViewModel.imagesLiveData.value?.clear()
        tumblrViewModel.imagesDataArray.clear()
    }

    private fun openDetailActivity(imageUrl: String) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("url", imageUrl)
        startActivity(intent)
    }
}