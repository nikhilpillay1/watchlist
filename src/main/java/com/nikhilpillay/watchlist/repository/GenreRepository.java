package com.nikhilpillay.watchlist.repository;

import com.nikhilpillay.watchlist.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}