package com.joaovictor.moviescoroutines.ui.main

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

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
        }).start()
    }

    suspend fun getMoviesWCoroutines(): List<Movie> {
        return withContext(Dispatchers.Default) {
            delay(3000)

            listOf(
                Movie(1, "Movie 1"),
                Movie(2, "Movie 2")
            )
        }
    }
}