public class Actors {

    private String firstName;
    private String lastName;

    public Actors() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return getFirstName() + ' ' + getLastName();
    }
}
