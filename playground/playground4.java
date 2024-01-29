package playground;
import java.util.Scanner;
import java.util.InputMismatchException;
public class playground4 {
    public static void main(String[] args) {
        int num = 0;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter number");
            num = input.nextInt();
            if (num % 2 == 0) {
                System.out.printf("Num %d is even %n", num);
            } else {
                System.out.printf("Num %d is odd %n", num);
            }
        } catch (InputMismatchException e) {
            System.out.println("You have entered invalid data. An integer is required.");
        }

    }
}
