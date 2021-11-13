import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1 + (int) (Math.random() * 20);

        int t = 6;
        int i, g;

        System.out.println(
                "I am thinking of a number between 1 and 20." + " "
                        + "You have 6 attempts to guess the correct number." + " "
                        + "I'll provide you with hints toward guessing the correct number."
        );

        try {
            for (i = 1; i <= t; i++) {
                System.out.println("Now, go ahead, take a guess.");
                g = sc.nextInt();

                if (g == n) {
                    System.out.println("You guessed the correct number!");
                    break;
                } else if (n > g && i != t - 1) {
                    System.out.println("Your guess is too low.");
                } else if (n < g && i != t - 1) {
                    System.out.println("Your guess is too high.");
                }
                if (i == t) {
                    System.out.println("You have run out of guesses. The correct number was " + n + ".");
                }
            }
        } catch (Exception e) {
            System.out.println("You have entered an invalid number.");
        }
    }
}
