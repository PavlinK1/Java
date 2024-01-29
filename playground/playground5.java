package playground;

import java.util.Scanner;

public class playground5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        double num2 = input.nextDouble();
        System.out.printf("Num is %.5f%n", num2);

        byte Ivancho = 2;
        byte Ani = 5;
        byte Mariika = 6;
        byte Pencho = 4;
        byte Borislavcho = 5;

        String Ivan = "Ivancho";
        String Anna = "Ani";
        String Maria = "Mariika";
        String Pen = "Pencho";
        String Boris = "Borislavcho";


        System.out.printf("|%-12s%d|%n|%-12s%d|%n|%-12s%d|%n|%-12s%d|%n|%-12s%d|",
                Ivan, Ivancho, Anna, Ani, Maria, Mariika, Pen, Pencho, Boris, Borislavcho);

    }
}
