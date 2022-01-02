package com.infinity.navigationsample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.infinity.navigationsample.R
import com.infinity.navigationsample.databinding.MovieCardBinding
import com.infinity.navigationsample.models.Movie


class MoviesAdapter : RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder> (){





    inner class  MoviesViewHolder(private val itemViewBinding: MovieCardBinding): RecyclerView.ViewHolder(
        itemViewBinding.root
    ) {

        fun bindView(movieItem: Movie) {
            itemViewBinding.apply {
                movie = movieItem
            }

            itemViewBinding.root.setOnClickListener {
                onItemClickListener?.let {
                    it(movieItem)

                }
            }
        }
    }

    private val differCallBack  = object : DiffUtil.ItemCallback<Movie>()
    {

        override fun areItemsTheSame(oldItem: Movie, newItem: Movie): Boolean {
          return  oldItem.id== newItem.id
        }

        override fun areContentsTheSame(oldItem: Movie, newItem: Movie): Boolean {
            return  oldItem==newItem
        }

    }

    val differ = AsyncListDiffer(this, differCallBack)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        return MoviesViewHolder(

            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context), R.layout.movie_card, parent, false
            )
        )
    }

    private var onItemClickListener: ((Movie) -> Unit)? = null
    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {

        val movieItem= differ.currentList[position]
      holder.bindView(movieItem)
        }




    override fun getItemCount(): Int {
        return differ.currentList.size
    }
    fun setOnItemClickListener(listener: (Movie) -> Unit) {
        onItemClickListener = listener

    }
}