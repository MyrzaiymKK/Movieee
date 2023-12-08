package service.iml;

import Base.DataBase;
import Models.Movie;
import service.SortService;

import java.util.Comparator;
import java.util.List;

public class SortImpl implements SortService {
    @Override
    public List<Movie> sortByMovieName(String ascOrDesc) {//asc a-z
        Comparator<Movie> link = Comparator.comparing(Movie::getName);
        if (ascOrDesc.equalsIgnoreCase("asc")){
            DataBase.movies.sort(link);
            return DataBase.movies;
        } else if (ascOrDesc.equalsIgnoreCase("desc")) { // desc z-a
            DataBase.movies.sort(link.reversed());
            return DataBase.movies;
        }
        return null;
    }

    @Override
    public List<Movie> sortByYear(String ascOrDesc) {
        Comparator<Movie> linkk = Comparator.comparing(Movie::getYear);
        if(ascOrDesc.equalsIgnoreCase("ask")){
            DataBase.movies.sort(linkk);
            return DataBase.movies;
        } else if (ascOrDesc.equalsIgnoreCase("desc")){
            DataBase.movies.sort(linkk.reversed());
            return DataBase.movies;
        }
        return null;
    }

    @Override
    public List<Movie> sortByProducer() {
       DataBase.movies.sort(SortImpl.comparator);
       return DataBase.movies;
    }

    public static Comparator<Movie> comparator = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getProducer().getFirstName().compareTo(o2.getProducer().getFirstName());
        }
    };
}
