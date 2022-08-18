import java.io.IOException;
import java.util.Scanner;

public class MovieLibrary {

    public static void main(String[] args) throws IOException {

        ListModifier listModifier = new ListModifier();
        Scanner input = new Scanner(System.in);

        listModifier.menuOptions();

        int userInput = input.nextInt();
        switch (userInput) {
            case 1 -> {
                System.out.println("enter from-to dates in year format");
            }
            case 2 -> listModifier.randomMovie();
            case 3 -> listModifier.findMovieByActor();
            default -> System.out.println("Sorry - try again!");
        }
    }
}
