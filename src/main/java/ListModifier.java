import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class ListModifier {

    static ObjectMapper mapper = new ObjectMapper();
    File movieFile = new File("src/main/resources/movies.json");
    List<Movie> movieList = mapper.readValue(movieFile, new TypeReference<List<Movie>>() {});
    Scanner input = new Scanner(System.in);

    public ListModifier() throws IOException {
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
                System.out.println(movie);
            }
        }
        System.out.println("No movies found :(");
    }

    public void findMovieByActor() {
        System.out.println("Enter actor's name");
        String actorName = input.nextLine();
        String actorSurname = input.nextLine();
        for (Movie movie : movieList) {
            if(movie.getActors().stream().anyMatch(m -> m.getFirstName().equals(actorName))
                && movie.getActors().stream().anyMatch(m -> m.getLastName().equals(actorSurname))) {
                System.out.println(movie);
            }
        }
        System.out.println("Who?"); //zerkac jeszcze na to bo wyswietla sie pomimo wyniku
    }


    public void randomMovie() {
        System.out.println("Enter a number between 0-6");
        int userSelection = input.nextInt();
        System.out.println(movieList.get(userSelection));
    }
}
