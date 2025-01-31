package com.nikhilpillay.watchlist.service;

import com.nikhilpillay.watchlist.model.Genre;

import java.util.List;

public interface GenreService {

  void saveGenre(Genre genre);

  List<Genre> findAll();
}