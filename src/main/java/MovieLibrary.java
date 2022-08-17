import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class MovieLibrary {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        // to ma zostac bo dzieki temu toleruje pojedynczy bracket na samej gorze
        File movies = new File("movies.json"); // to jest ok
        try {
            Movie[] movieList = mapper.readValue(movies, Movie[].class);
            System.out.println(movieList.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
