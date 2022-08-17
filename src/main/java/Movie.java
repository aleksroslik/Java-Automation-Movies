import java.util.ArrayList;

public class Movie {

    public String[] movies = {getTitle(), getDate(), String.valueOf(getDirector()), String.valueOf(getActor())};
    private String title;
    private String date;
    private Director director;
    private Actor actor;


    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public Director getDirector() {
        return director;
    }

    public Actor getActor() {
        return actor;
    }

    @Override
    public String toString() {
        return getTitle() + getDate() + getDirector() + getActor();
    }
}
