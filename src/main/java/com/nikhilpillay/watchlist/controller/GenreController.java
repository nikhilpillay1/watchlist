package com.nikhilpillay.watchlist.controller;

import com.nikhilpillay.watchlist.model.Genre;
import com.nikhilpillay.watchlist.service.GenreService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genre")
public class GenreController {

  private final GenreService genreService;

  public GenreController(GenreService genreService) {
    this.genreService = genreService;
  }

  @PostMapping("/save")
  public ResponseEntity<Genre> saveGenre(@RequestBody Genre genre) {
    genreService.saveGenre(genre);
    return ResponseEntity.status(HttpStatus.CREATED).body(genre);
  }

  @GetMapping("/all")
  public ResponseEntity<List<Genre>> findAllGenres() {
    List<Genre> genres = genreService.findAll();
    return ResponseEntity.ok(genres);
  }

}