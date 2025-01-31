package com.nikhilpillay.watchlist.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Genre {

  public Genre() {
  }

  public Genre(Long id, String name, List<Movie> movie) {
    this.id = id;
    this.name = name;
    this.movie = movie;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @ManyToMany(mappedBy = "genres")
  private List<Movie> movie = new ArrayList<>();

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Movie> getMovie() {
    return movie;
  }

  public void setMovie(List<Movie> movie) {
    this.movie = movie;
  }
}