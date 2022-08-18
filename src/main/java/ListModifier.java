import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class ListModifier {

    static ObjectMapper mapper = new ObjectMapper();
    File movieFile = new File("src/main/resources/movies.json");
    List<Movie> movieList = mapper.readValue(movieFile, new TypeReference<List<Movie>>() {});
    Actors actors = new Actors();
    Movie movie = new Movie();
    Scanner input = new Scanner(System.in);

    public ListModifier() throws IOException {
    }

    public void menuOptions() {
        System.out.println("Select from the following options:");
        System.out.println("1 - Search for movies by date");
        System.out.println("2 - Get full information for a random movie");
        System.out.println("3 - Search for movies by actors name");
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
    }

    public void readFile() {
        try {
            Movie[] movieList = mapper.readValue(movieFile, Movie[].class);
            System.out.println(Arrays.asList(movieList));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void randomMovie() throws IOException {
        System.out.println("Enter a number between 0-6");
        int userSelection = input.nextInt();
        System.out.println(movieList.get(userSelection));
    }
}
