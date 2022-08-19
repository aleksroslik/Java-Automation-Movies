import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class ListModifier {

    static ObjectMapper mapper = new ObjectMapper();
    File movieFile = new File("src/main/resources/movies.json");
    List<Movie> movieList;
    Scanner input = new Scanner(System.in);

    {
        try {
            movieList = mapper.readValue(movieFile, new TypeReference<List<Movie>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void menuOptions() {
        System.out.println("Select from the following options:");
        System.out.println("1 - Search for movies by date");
        System.out.println("2 - Get full information for a random movie");
        System.out.println("3 - Search for movies by actors name");
    }

    public void findMovieByDate() {
        System.out.println("Enter 2 dates (years to and from) to filter movies");
        int yearFrom = input.nextInt();
        int yearTo = input.nextInt();
        for (Movie movie : movieList) {
            if (movie.getDate() >= yearFrom && movie.getDate() <= yearTo) {
                System.out.println(movie.getTitle());
            }
        }
    }

    public void findMovieByActor() {
        System.out.println("Enter actor's name");
        String actorName = input.nextLine();
        String actorSurname = input.nextLine();
        for (Movie movie : movieList) {
            if (movie.getActors().stream().anyMatch(m -> m.getFirstName().equals(actorName))
                    && movie.getActors().stream().anyMatch(m -> m.getLastName().equals(actorSurname))) {
                System.out.println(movie.getTitle());
            }
        }
    }

    public void randomMovieGenerator() {
        Movie movie = new Movie();
        System.out.println(movie.getRandomElement(movieList));
    }
}
