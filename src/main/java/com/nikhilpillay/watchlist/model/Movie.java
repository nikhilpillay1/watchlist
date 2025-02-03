package com.nikhilpillay.watchlist.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Movie {

  public Movie() {
  }

  public Movie(Long id, String name, List<Genre> genres, boolean isSeries, String submitter) {
    this.id = id;
    this.name = name;
    this.genres = genres;
    this.isSeries = isSeries;
    this.submitter = submitter;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @ManyToMany
  @JoinTable(
      name = "movie_genre",
      joinColumns = @JoinColumn(name = "movie_id"),
      inverseJoinColumns = @JoinColumn(name = "genre_id")
  )
  private List<Genre> genres = new ArrayList<>();

  boolean isSeries;

  private String submitter;

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

  public List<Genre> getGenres() {
    return genres;
  }

  public void setGenres(List<Genre> genres) {
    this.genres = genres;
  }

  public boolean isSeries() {
    return isSeries;
  }

  public void setSeries(boolean series) {
    isSeries = series;
  }

  public String getSubmitter() {
    return submitter;
  }

  public void setSubmitter(String submitter) {
    this.submitter = submitter;
  }
}