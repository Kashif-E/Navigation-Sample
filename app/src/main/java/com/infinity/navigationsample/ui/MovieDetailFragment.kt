package com.infinity.navigationsample.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.infinity.navigationsample.R
import com.infinity.navigationsample.databinding.FragmentMovieDetailBinding
import com.infinity.navigationsample.viewmodel.ViewModel

class MovieDetailFragment : Fragment(R.layout.fragment_movie_detail) {

    private lateinit var binding: FragmentMovieDetailBinding
    private val args: MovieDetailFragmentArgs by navArgs()
    private val viewModel: ViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentMovieDetailBinding.bind(view)

        binding.movie = args.movie

        binding.fab.setOnClickListener {
            viewModel.savedMovies.add(args.movie)
        }

    }
}