import java.util.List;

public class Movie {

    private String title;
    private Director director;
    private String genre;
    private int date;
    private List<Actor> actors;

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

    public List<Actor> getActors() {
        return actors;
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
