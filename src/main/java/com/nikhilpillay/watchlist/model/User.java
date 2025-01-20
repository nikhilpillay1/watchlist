package com.nikhilpillay.watchlist.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "app_user")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  String name;

  @OneToMany(mappedBy = "submittedBy", cascade = CascadeType.ALL)
  private List<Movie> movies;
}