package com.infinity.navigationsample.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.infinity.navigationsample.R
import com.infinity.navigationsample.adapter.MoviesAdapter
import com.infinity.navigationsample.databinding.FragmentMovieBinding
import com.infinity.navigationsample.models.Movie
import com.infinity.navigationsample.viewmodel.ViewModel

class MoviesFragment : Fragment(R.layout.fragment_movie) {

    private lateinit var binding: FragmentMovieBinding
    private val viewModel: ViewModel by activityViewModels()

    private lateinit var adapter: MoviesAdapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMovieBinding.bind(view)
        adapter = MoviesAdapter()
        Log.e("savedMovies", viewModel.savedMovies.toString())
        binding.recyclerView.adapter = adapter
        adapter.differ.submitList(viewModel.popularMovies)
        adapter.setOnItemClickListener { movie ->

            findNavController().navigate(
                MoviesFragmentDirections.actionMoviesFragmentToMovieDetailFragment(
                    movie
                )
            )

        }
    }
}