import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MovieLibrary movieLibrary = new MovieLibrary();
        Scanner input = new Scanner(System.in);

        movieLibrary.menuOptions();

        int userInput = input.nextInt();

        switch (userInput) {
            case 1 -> {
                System.out.println("Enter 2 dates (years to and from) to filter movies");
                movieLibrary.findMovieByDate(input.nextInt(), input.nextInt());
            }
            case 2 -> movieLibrary.randomMovieGenerator();
            case 3 -> {
                System.out.println("Enter actor's name and surname");
                movieLibrary.findMovieByActor(input.next(), input.next());
            }
            default -> System.out.println("Sorry - try again!");
        }
    }
}
