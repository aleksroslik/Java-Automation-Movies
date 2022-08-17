import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class MovieLibrary {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper(); // stworzyc metode w klasie Movies zeby znowu nie zasmiecalo main
        File movies = new File("src/main/resources/movies.json"); // to jest ok
        try {
            Movie[] movieList = mapper.readValue(movies, Movie[].class);
            System.out.println(Arrays.asList(movieList));
            /*List<Movie> movieList = mapper.readValue(movies, new TypeReference<List<Movie>>() {
            });
            System.out.println(movieList);*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
