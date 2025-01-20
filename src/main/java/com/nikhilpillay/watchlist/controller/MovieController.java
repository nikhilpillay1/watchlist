package com.nikhilpillay.watchlist.controller;

import com.nikhilpillay.watchlist.model.Movie;
import com.nikhilpillay.watchlist.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

  private final MovieService movieService;

  public MovieController(MovieService movieService) {
    this.movieService = movieService;
  }

  @PostMapping("/save")
  public ResponseEntity<Movie> submitMovie(@RequestBody Movie movie) {
    movieService.submitMovie(movie);
    return ResponseEntity.status(HttpStatus.CREATED).body(movie);
  }

  @GetMapping("/all")
  public ResponseEntity<List<Movie>> findAllMovies() {
    List<Movie> movies = movieService.findAll();
    return ResponseEntity.ok(movies);
  }

}