public class Director {

    private String firstName;
    private String lastName;

    public Director() {

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
