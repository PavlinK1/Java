package playground;

public class playground3 {
    public static void main(String[] args) {

        // Напишете програма Distance, която изчислява разстоянието от
        // точка (x,y) до (0,0) по формулата:
        double x = 3;
        double y = 4;

        System.out.println(Math.sqrt(x * x + y * y));

        /* Напишете програма SpringSeason, в която дефинирате 2 int
        променливи - month & day. Програмата трябва да отпечатва true
        ако денят е между 20ти Март (включително) и 20ти Юни
        (включително) и false в противен случай. Булева стойност на израза
        ? „yes” : “false” */
        int month = 4;
        int day = 15;

        boolean isSpring = (month == 3 && day >= 20)  ||
                           (month == 4 || month == 5) ||
                           (month == 6 && day <= 20);

        System.out.println(isSpring ? "yes" : "false");

        // Калкулиране на BMI
        double weight = 79;
        double height = 1.76;

        System.out.println(weight / (Math.pow(height, 2)));

    }
}
