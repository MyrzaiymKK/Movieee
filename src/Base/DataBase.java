package Base;

import Enams.Genre;
import Models.Actor;
import Models.Movie;
import Models.Producer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DataBase {

   static List<Actor> actors = new LinkedList<>(Arrays.asList(
            new Actor("Mika", "glavnyi"),
            new Actor("Beka", "glavnyi"),
            new Actor("Nurs", "atasy"),
            new Actor("Askhat", "brat"),
            new Actor("Ajybek", "drug"),
            new Actor("Aiturgan", "main")
    ));
    static List<Actor> actors2 = new LinkedList<>(Arrays.asList(
            new Actor("Mika", "glavnyi"),
            new Actor("Beka", "glavnyi"),
            new Actor("Nurs", "atasy"),
            new Actor("Askhat", "brat"),
            new Actor("Ajybek", "drug"),
            new Actor("Aiturgan", "main")
    ));
   static List<Actor> actors3 = new LinkedList<>(Arrays.asList(
            new Actor("Mika", "glavnyi"),
            new Actor("Beka", "glavnyi"),
            new Actor("Nurs", "atasy"),
            new Actor("Askhat", "brat"),
            new Actor("Ajybek", "drug"),
            new Actor("Aiturgan", "main")
    ));


   static Producer producer1 = new Producer("Nurislam", "Toigonbaev");
   static Producer producer2 = new Producer("Myrzaiym", "Keldibekova");
   static Producer producer3 = new Producer("Gulumkan", "Asanbekova");


    public static List<Movie> movies = new LinkedList<>(Arrays.asList(
            new Movie("Do vstrechi s toboi",2010, Genre.MELODRAMA,producer2,actors),
            new Movie("Povorot ne tuda",2003, Genre.HORROR,producer1,actors2),
            new Movie("Vek Adalin",2010, Genre.FANTASY,producer2,actors3),
            new Movie("Bratiya Grimzbi",2014, Genre.COMEDY,producer1,actors2),
            new Movie("Ajar",2003, Genre.MELODRAMA,producer3,actors)
    ));

}
