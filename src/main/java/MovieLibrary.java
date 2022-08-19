import java.util.Scanner;

public class MovieLibrary {

    public static void main(String[] args) {

        ListModifier listModifier = new ListModifier();
        Scanner input = new Scanner(System.in);

        listModifier.menuOptions();

        int userInput = input.nextInt();
        switch (userInput) {
            case 1 -> listModifier.findMovieByDate();
            case 2 -> listModifier.randomMovieGenerator();
            case 3 -> listModifier.findMovieByActor();
            default -> System.out.println("Sorry - try again!");
        }
    }
}
