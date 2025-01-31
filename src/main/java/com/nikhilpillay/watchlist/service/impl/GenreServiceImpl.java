package com.nikhilpillay.watchlist.service.impl;

import com.nikhilpillay.watchlist.model.Genre;
import com.nikhilpillay.watchlist.repository.GenreRepository;
import com.nikhilpillay.watchlist.service.GenreService;

import java.util.List;

public class GenreServiceImpl implements GenreService {

  private final GenreRepository genreRepository;

  public GenreServiceImpl(GenreRepository genreRepository) {
    this.genreRepository = genreRepository;
  }

  @Override
  public void saveGenre(Genre genre) {
    genreRepository.save(genre);
  }

  @Override
  public List<Genre> findAll() {
    return genreRepository.findAll();
  }
}