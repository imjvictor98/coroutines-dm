package com.joaovictor.moviescoroutines.ui.main

class MainRepository {

    fun getMovies(callback: (movies: List<Movie>) -> Unit){
        Thread(Runnable {
            Thread.sleep(3000)
            callback.invoke(
                listOf(
                    Movie(1, "Movie 1"),
                    Movie(2, "Movie 2")
                )
            )
        })
    }
}