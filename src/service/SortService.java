package service;

import Models.Movie;

import java.util.List;

public interface SortService {
    List<Movie> sortByMovieName(String ascOrDesc);

    List<Movie> sortByYear(String ascOrDesc);

    List<Movie> sortByProducer();
}
