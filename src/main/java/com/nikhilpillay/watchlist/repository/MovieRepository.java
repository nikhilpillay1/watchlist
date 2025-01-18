package com.nikhilpillay.watchlist.repository;

import com.nikhilpillay.watchlist.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}