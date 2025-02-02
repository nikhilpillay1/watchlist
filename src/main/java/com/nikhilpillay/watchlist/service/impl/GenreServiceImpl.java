package com.nikhilpillay.watchlist.service.impl;

import com.nikhilpillay.watchlist.model.Genre;
import com.nikhilpillay.watchlist.repository.GenreRepository;
import com.nikhilpillay.watchlist.service.GenreService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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

  @Override
  public void deleteById(Long id) {
    if (!genreRepository.existsById(id)) {
      throw new EntityNotFoundException("Movie not found with id: " + id);
    }
    genreRepository.deleteById(id);
  }
}