package com.nikhilpillay.watchlist.service.impl;

import com.nikhilpillay.watchlist.model.Genre;
import com.nikhilpillay.watchlist.model.Movie;
import com.nikhilpillay.watchlist.model.MovieSubtitle;
import com.nikhilpillay.watchlist.repository.MovieRepository;
import com.nikhilpillay.watchlist.service.MovieService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

  public MovieServiceImpl(MovieRepository repository) {
    this.repository = repository;
  }

  private final MovieRepository repository;

  @Override
  public void submitMovie(Movie movie) {
    for (MovieSubtitle subtitle : movie.getSubtitles()) {
      subtitle.setMovie(movie);
    }
    for (Genre genre : movie.getGenres()) {
      genre.setMovie(movie);
    }
    repository.save(movie);
  }

  @Override
  public List<Movie> findAll() {
    return repository.findAll();
  }
}