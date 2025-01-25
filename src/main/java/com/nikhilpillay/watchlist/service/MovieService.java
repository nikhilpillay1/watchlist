package com.nikhilpillay.watchlist.service;

import com.nikhilpillay.watchlist.model.Movie;

import java.util.List;

public interface MovieService {

  void submitMovie(Movie movie);

  List<Movie> findAll();

  void deleteById(Long id);
}