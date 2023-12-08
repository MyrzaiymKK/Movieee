package service.iml;

import Base.DataBase;
import Enams.Genre;
import Models.Actor;
import Models.Movie;
import service.FindService;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class FindImpl implements FindService {
    @Override
    public List<Movie> getAllMovies() {
        return DataBase.movies;
    }

    @Override
    public List<Movie> findMovieByNameOrPartName(String name) {
        List<Movie> newArray = new LinkedList<>();
        for (Movie movie : DataBase.movies) {
            if(movie.getName().toLowerCase().contains(name.toLowerCase())){
                newArray.add(movie);
            }
        }
        return newArray.isEmpty() ? null : newArray;
    }

    @Override
    public List<Movie> findMovieByActorName(String actorName) {
        List<Movie> newList = new LinkedList<>();
        for (Movie movie : DataBase.movies) {
            for (Actor actor : movie.actors) {
                if(actor.getFullName().equalsIgnoreCase(actorName)){
                    newList.add(movie);
                }
            }
        }
        return newList.isEmpty() ? null : newList;
    }

    @Override
    public List<Movie> findMovieByYear(int year) {
        List<Movie> newLnk = new LinkedList<>();
        for (Movie movie : DataBase.movies) {
            if(movie.getYear() == year){
                newLnk.add(movie);
            }
        }
        return newLnk.isEmpty() ? null : newLnk;
    }

    @Override
    public List<Movie> findMovieByProducer(String producerName) {
        List<Movie> linkk = new LinkedList<>();
        for (Movie movie : DataBase.movies) {
            if(movie.getProducer().getFirstName().equalsIgnoreCase(producerName)){
                linkk.add(movie);
            }
        }
        return linkk.isEmpty() ? null : linkk;
    }

    @Override
    public List<Movie> findMovieByGenre(Genre genre) {
        List<Movie> listt = new LinkedList<>();
        for (int i = 0; i < DataBase.movies.size(); i++) {
            if(DataBase.movies.get(i).getGenre().equals(genre)){
                listt.add(DataBase.movies.get(i));
            }
        }
        return listt.isEmpty() ? null : listt;
    }

    @Override
    public List<Movie> findMovieByRole(String role) {
        List<Movie> linkB = new LinkedList<>();
        for (Movie movie : DataBase.movies) {
            for (Actor actor : movie.actors) {
                if(actor.getRole().equalsIgnoreCase(role)){
                    linkB.add(movie);
                }
            }
        }
        return linkB.isEmpty() ? null : linkB;
    }
}
