package playground;

public class playground {
    public static void main(String[] args) {
        // Manipulate the string of your name
        String superstar = "Pavlin";

        int lengthOfSuperstar = superstar.length();
        String superstarUppercase = superstar.toUpperCase();
        String superstarLowercase = superstar.toLowerCase();

        System.out.printf("%d\n%s\n%s\n", lengthOfSuperstar, superstarUppercase, superstarLowercase);
        System.out.println();

        // Sum of two numbers
        short a = 32;
        short b = 14;

        System.out.println("Sum of a + b is " + (a + b));
        System.out.println();

        // Absolute value of the given numbers

        int[] numbers = {-147, 15, 0, 18};

        for (int number : numbers) {
            System.out.printf("The absolute value of %d is %d\n", number,  Math.abs(number));
        }
        System.out.println();

        // The square root of the given numbers
        double[] squareRootsNumbers = {8, 353, 78, 3, -67, 723, 2000, -100};

        for (double number : squareRootsNumbers) {
            int num = (int) number;
            System.out.printf("The square root value of %d is %.2f\n", Math.abs(num), Math.sqrt(Math.abs(number)));
        }
        System.out.println();

        // The pow value of the given numbers
        double[] powNumbers = {-20, 92, 638, 73, 200, -22};

        for (double number : powNumbers) {
            int num = (int) number;
            System.out.printf("The pow value of %d is %.2f\n", num, Math.pow(number, 2));
        }
    }
}


