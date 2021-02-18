import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    void options(int opt) {
        if (opt == 1) {
            System.out.println("Lets start the game:");
            System.out.print("Enter the number of times you want to roll the dice");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (n == 5) {
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    Random random = new Random();
                    int x = random.nextInt(6) + 1;
                    sum = sum + x;
                }
                System.out.println(sum);
            } else {
                System.out.println("enter the number of rolls as 5  next time");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("MENU");
        System .out.print("To start the game press 1 otherwise press any other key to exit game");
        DiceGame dice=new DiceGame();
        Scanner scanner=new Scanner(System.in);
        dice.options(scanner.nextInt());


    }
}
