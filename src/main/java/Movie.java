import java.util.List;
import java.util.Random;

public class Movie {

    private String title;
    private Director director;
    private String genre;
    private int date;
    private List<Actors> actors;

    public Movie() {
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public int getDate() {
        return date;
    }

    public Director getDirector() {
        return director;
    }

    public List<Actors> getActors() {
        return actors;
    }

    public Movie getRandomElement(List<Movie> movieList) {
        Random randomMovie = new Random();
        return movieList.get(randomMovie.nextInt(movieList.size()));
    }

    @Override
    public String toString() {
        return '\n' + "Movie Title: " + getTitle() + '\n' +
                "Director: " + getDirector() + '\n' +
                "Genre: " + getGenre() + '\n' +
                "Date: " + getDate() + '\n' +
                "Actors: " + getActors() + '\n';
    }
}
