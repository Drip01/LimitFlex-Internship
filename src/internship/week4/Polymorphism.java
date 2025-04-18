package internship.week4;

import internship.week3.RecordProject;

import java.util.Scanner;

public class Polymorphism {

//    public static void main(String[] args) {
//
////        Movie theMovie = Movie.getMovie("S", "Star wars");
////        theMovie.watchMovie();
//
//          Scanner s = new Scanner(System.in);
//          while (true) {
//              System.out.println("Enter Type (A for Adventure C for Comedy, " +
//                      "S for Science Fiction, or Q to quit): ");
//              String type = s.nextLine();
//              if ("Qq".contains(type)) {
//                  break;
//              }
//              System.out.println("Enter Movie Title: ");
//              String title = s.nextLine();
//              Movie movie = Movie.getMovie(type, title);
//              movie.watchMovie();
//          }
//    }
}

class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {

        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie {

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens");
    }

    public void watchAdventure() {
        System.out.println("Watching an Adventure!");
    }
}

class Comedy extends Movie {

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy ending");
    }

    public void watchComedy() {
        System.out.println("Watching a Comedy!");
    }
}

class ScienceFiction extends Movie {

    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Bad Alien Do Bad Stuffs",
                "Space Guys Chase Aliens",
                "Planet Blows up");
    }

    public void watchScienceFiction() {
        System.out.println("Watching a Science Fiction Thriller");
    }
}

class NextMain {

    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Millions");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchMovie();

        var millions  = Movie.getMovie("C", "Millions");
        millions.watchMovie();

        var plane = new Comedy ("Millions");
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("S", "Star Wars");
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }
    }
}
