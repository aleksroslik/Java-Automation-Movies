import java.util.List;

public class Movie {

    private String title;
    private Director director;
    private String genre;
    private int date;
    private List<Actors> actors;


    /*public Movie(String title, Director director, String genre, int date, List<Actors> actors) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.date = date;
        this.actors = actors;
    }*/

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

    @Override
    public String toString() {
        return '\n' + "Movie Title: " + getTitle() + '\n' +
                "Director: " + getDirector() + '\n' +
                "Genre: " + getGenre() + '\n' +
                "Date: " + getDate() + '\n' +
                "Actors: " + getActors() + '\n';
    }
}
