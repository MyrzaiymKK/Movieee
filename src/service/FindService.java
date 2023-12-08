package service;

import Enams.Genre;
import Models.Movie;

import java.time.Year;
import java.util.List;

public interface FindService {
    List<Movie> getAllMovies();

    List<Movie> findMovieByNameOrPartName(String name);
    List<Movie> findMovieByActorName(String actorName);
    List<Movie>findMovieByYear(int year);
    List<Movie> findMovieByProducer(String producerName);
    List<Movie> findMovieByGenre(Genre genre);
    List<Movie> findMovieByRole(String role);



}
