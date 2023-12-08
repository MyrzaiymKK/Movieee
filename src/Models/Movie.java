package Models;

import Enams.Genre;

import java.util.LinkedList;
import java.util.List;

public class Movie {
    private String name;
    private int year;
    private Genre genre;
    private Producer producer;
    public List<Actor> actors = new LinkedList<>();

    public Movie(String name, int year, Genre genre, Producer producer, List<Actor> linkedList) {
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.producer = producer;
        this.actors = linkedList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Movie{" + "\n" +
                "name - >" + name + "\n" +
                "year - >" + year + "\n"+
                "genre - >" + genre + "\n" +
                "producer - >" + producer + "\n" +
                "linkedList - >" + actors +
                '}';
    }
}
