import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("You are in a land full of dragons.");
        System.out.println("In front of you, you see two caves.");
        System.out.println("In one cave, the dragon is friendly and will share his treasure with you.");
        System.out.println("The other dragon is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into? (1 or 2)");

        try {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            String str = "";

            switch (n) {
                case 1:
                    System.out.println("You approach the cave...");
                    System.out.println("It is dark and spooky...");
                    System.out.println("A large dragon jumps out in front of you!");
                    System.out.println("He opens his jaws and...");
                    System.out.println("Gobbles you down in one bite!");
                    break;
                case 2:
                    System.out.println("You approach the cave...");
                    System.out.println("It is dark and spooky...");
                    System.out.println("Yet a light flickers off in the distance...");
                    System.out.println("You approach slowly...");
                    System.out.println("Swiftly, a large dragon descends!");
                    System.out.println("It leaves a token, winks, and glides away...");
                    System.out.println("You take the token and set forth to leave the cave...");
                    System.out.println("The light remains flickering. A fortuitous day...");
                default: throw new Exception("Invalid input");
            }
        } catch (Exception e) {
            if (e.getMessage() != null) {
                System.out.println(e.getMessage());
            }
            System.out.println("These are your only choices...");
        }
    }
}