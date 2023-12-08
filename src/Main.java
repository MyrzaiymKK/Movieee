import Enams.Genre;
import service.FindService;
import service.SortService;
import service.iml.FindImpl;
import service.iml.SortImpl;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanForStr = new Scanner(System.in);
        FindService service = new FindImpl();
        SortService service1 = new SortImpl();
        while (true){
            System.out.println("""
                    1-> Get all movies
                    2-> Find movie by name
                    3-> Find movie by actor name;
                    4-> Find movie by year
                    5-> Find movie by Producer name
                    6-> Find movie by genre
                    7-> Find movie by Role
                    8-> Sort by Movie name
                    9-> Sort by year
                    10-> Sort by Producer
                    """);
            switch (scanner.nextLine()){
                case"1"->{
                    System.out.println(service.getAllMovies());
                }
                case"2"->{
                    System.out.println("Write name of movie ");
                    String name = scanner.nextLine();
                    if (service.findMovieByNameOrPartName(name) == null){
                        System.out.println("Not found with this name");
                    } else System.out.println(service.findMovieByNameOrPartName(name));
                }
                case"3"->{
                    System.out.println("Write actor name: ");
                    String names = scanForStr.nextLine();
                    if (service.findMovieByActorName(names) == null){
                        System.out.println("Not found");
                    } else  System.out.println(service.findMovieByActorName(names));

                }
                case"4"->{
                    System.out.println("Write movie year: ");
                    int yearr = scanner.nextInt();
                    if(service.findMovieByYear(yearr) == null){
                        System.out.println("Not found ");
                    } else System.out.println(service.findMovieByYear(yearr));
                }
                case"5"->{
                    System.out.println("Write name of producer: ");
                    String nam = scanner.nextLine();
                    if(service.findMovieByProducer(nam) == null){
                        System.out.println("Not found");
                    }else System.out.println(service.findMovieByProducer(nam));
                }
                case"6"->{
                    System.out.println("Write genre of film: ");
                    String genre = scanForStr.nextLine();
                    if (genre.equalsIgnoreCase("comedy")){
                        System.out.println(service.findMovieByGenre(Genre.COMEDY));
                    } else if(genre.equalsIgnoreCase("melodrama")){
                        System.out.println(service.findMovieByGenre(Genre.MELODRAMA));
                    }else if (genre.equalsIgnoreCase("fantasy")){
                        System.out.println(service.findMovieByGenre(Genre.FANTASY));
                    } else if (genre.equalsIgnoreCase("horror")) {
                        System.out.println(service.findMovieByGenre(Genre.HORROR));
                    }else System.out.println("Not found");
                }
                case"7"->{
                    System.out.println("Write role: ");
                    String role = scanner.nextLine();
                    if(service.findMovieByRole(role) == null){
                        System.out.println("Not found");
                    }else System.out.println(service.findMovieByRole(role));

                }
                case"8"->{
                    System.out.println("Write asc or desc ");
                    String num = scanForStr.nextLine();
                    if(service1.sortByMovieName(num) == null){
                        System.out.println("Not found");
                    }else System.out.println(service1.sortByMovieName(num));
                }
                case"9"->{
                    System.out.println("Write asc or desc ");
                    String numm  = scanForStr.nextLine();
                    if(service1.sortByYear(numm) == null){
                        System.out.println("Not found");
                    } else System.out.println(service1.sortByYear(numm));
                }
                case"10"->{
                    System.out.println(service1.sortByProducer());
                }
            }
        }
    }
}