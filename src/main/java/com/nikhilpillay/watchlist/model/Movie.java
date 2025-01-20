package com.nikhilpillay.watchlist.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Movie {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  String name;

//  int releaseYear;

  List<String> genres;

  boolean isSeries;

  List<String> subtitles;

  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  private User submittedBy;

}