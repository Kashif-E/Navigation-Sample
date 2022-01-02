package com.infinity.navigationsample.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.infinity.navigationsample.R
import com.infinity.navigationsample.adapter.MoviesAdapter
import com.infinity.navigationsample.databinding.FragmentSavedMoviesBinding
import com.infinity.navigationsample.viewmodel.ViewModel

class SavedMovies : Fragment(R.layout.fragment_saved_movies) {

    private val viewModel: ViewModel by activityViewModels()

    private lateinit var adapter: MoviesAdapter
    lateinit var binding: FragmentSavedMoviesBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSavedMoviesBinding.bind(view)
        adapter = MoviesAdapter()
        binding.recyclerView.adapter = adapter
        adapter.differ.submitList(viewModel.savedMovies)

        adapter.setOnItemClickListener { movie ->
            findNavController().navigate(
                SavedMoviesDirections.actionSavedMoviesToMovieDetailFragment(
                    movie
                )
            )
        }
    }
}