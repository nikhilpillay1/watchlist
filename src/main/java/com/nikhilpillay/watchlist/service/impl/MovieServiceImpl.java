package com.nikhilpillay.watchlist.service.impl;

import com.nikhilpillay.watchlist.model.Movie;
import com.nikhilpillay.watchlist.repository.MovieRepository;
import com.nikhilpillay.watchlist.service.MovieService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

  private final MovieRepository repository;

  public MovieServiceImpl(MovieRepository repository) {
    this.repository = repository;
  }

  @Override
  public void submitMovie(Movie movie) {
    repository.save(movie);
  }

  @Override
  public List<Movie> findAll() {
    return repository.findAll();
  }

  @Override
  public void deleteById(Long id) {
    if (!repository.existsById(id)) {
      throw new EntityNotFoundException("Movie not found with id: " + id);
    }
    repository.deleteById(id);
  }
}