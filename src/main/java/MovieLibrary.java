import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class MovieLibrary {

    private static List<Movie> movieList;

    ObjectMapper mapper = new ObjectMapper();
    File movieFile = new File("src/main/resources/movies.json");
    {
        try {
            movieList = mapper.readValue(movieFile, new TypeReference<>() {});
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

    public void findMovieByDate(int yearFrom, int yearTo) {
        for (Movie movie : movieList) {
            if (movie.getDate() >= yearFrom && movie.getDate() <= yearTo) {
                System.out.println(movie.getTitle());
            }
        }
    }

    public void findMovieByActor(String firstName, String lastName) {
        for (Movie movie : movieList) {
            if (movie.getActors().stream().anyMatch(m -> m.getFirstName().equals(firstName))
                    && movie.getActors().stream().anyMatch(m -> m.getLastName().equals(lastName))) {
                System.out.println(movie.getTitle());
            }
        }
    }

    public Movie getRandomElement(List<Movie> movieList) {
        Random randomMovie = new Random();
        return movieList.get(randomMovie.nextInt(movieList.size()));
    }

    public void randomMovieGenerator() {
        System.out.println(getRandomElement(movieList));
    }
}

