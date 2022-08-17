import java.util.List;

public class Movie {

    private String title;
    private Director director;
    private String genre;
    private String date;
    private List<Actors> actors;

    public Movie(String title, Director director, String genre, String date, List<Actors> actors) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.date = date;
        this.actors = actors;
    }

    public Movie() {

    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
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
        return "Movie{" +
                "title='" + title + '\'' +
                ", director=" + director +
                ", genre='" + genre + '\'' +
                ", date='" + date + '\'' +
                ", actors=" + actors +
                '}';
    }
}
