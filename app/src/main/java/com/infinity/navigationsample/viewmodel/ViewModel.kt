package com.infinity.navigationsample.viewmodel

import androidx.lifecycle.ViewModel
import com.infinity.navigationsample.models.Movie

class ViewModel : ViewModel() {

    val savedMovies = mutableListOf<Movie>()
    val popularMovies = mutableListOf(
        Movie(
            id = "11",
            backdrop_path = "/1Rr5SrvHxMXHu5RjKpaMba8VTzi.jpg",
            overview = "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
            release_date = "2021-12-15",
            vote_average = "9.0",
            poster_path = "1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
            title = "Spider-Man: No Way Home",
            popular = true,
            latest = false,
            popularity = "10039.54",
        ),
        Movie(
            id = "22",
            vote_average = "8.9",
            overview = "\tAn enchanting making-of story told through all-new in-depth interviews and cast conversations, inviting fans on a magical first-person journey through one of the most beloved film franchises of all time.",
            release_date = "2022-01-01",
            backdrop_path = "/8rft8A9nH43IReybFtYt21ezfMK.jpg",
            title = "Return to Hogwarts",
            poster_path = "/cBc8kP23xdEW64htQGhCqBtZdkE.jpg",
            popularity = "344.33",
            popular = true,
            latest = false,
        ),
        Movie(
            id = "223",
            vote_average = "9.7",
            overview = "Legendary bounty hunter Boba Fett and mercenary Fennec Shand must navigate the galaxy’s underworld when they return to the sands of Tatooine to stake their claim on the territory once ruled by Jabba the Hutt and his crime syndicate.",
            release_date = "2021-12-29",
            backdrop_path = "/sjx6zjQI2dLGtEL0HGWsnq6UyLU.jpg",
            title = "The Book of Boba Fett",
            poster_path = "/gNbdjDi1HamTCrfvM9JeA94bNi2.jpg",
            popular = true,
            latest = true,
            popularity = "2222"
        )
    )
}