package playground;

import java.math.BigDecimal;
import java.math.BigInteger;

public class playground2 {
    public static void main(String[] args) {
        // First part of homework

        short number = -250;
        short number1 = 250;
        int number2 = 4_589_498;

        BigInteger number3 = new BigInteger("10000000000000000000");
        System.out.printf("number = %d\nnumber1 = %d\nnumber2 = %d\nnumber3 = %d\n",
                number, number1, number2, number3);

        int number4 = 43_112;
        int number5 = -1_357_674;
        int number6 = 1_357_674;
        int number7 = 1_357_674_000;
        long number8 = 3_657_895_000L;

        System.out.printf("number4 = %d\nnumber5 = %d\nnumber6 = %d\nnumber7" +
                " = %d\nnumber8 = %d\n", number4, number5, number6, number7, number8);

        float number9 = 4.9876543f;
        double number10 = 7.123456789012345678890d;
        double number11 = 18_398_458_438_583_853.28d;
        double number12 = 18_398_458_438_583_853.39875937284928422d;

        System.out.println("number9 " + BigDecimal.valueOf(number9));
        System.out.println("number10 " + BigDecimal.valueOf(number10));
        System.out.println("number11 " + BigDecimal.valueOf(number11));
        System.out.println("number12 " + BigDecimal.valueOf(number12));

        // Second part of homework

        byte myAge = 24;
        byte randomAge = 22;
        String myName = "Pavlin";
        String myLastName = "Karchev";
        String randomName = "Ferhunde";
        String randomLastName = "Kahlantuju";


        System.out.println(myName);
        System.out.println(myName.equals(randomName));
        System.out.println(myName.equalsIgnoreCase(randomName));
        System.out.println(myName.compareTo(randomName));
        System.out.println(myName + myLastName);
        System.out.println(myAge);
        System.out.println(myName + ' ' + myLastName + ' ' + myAge);
        System.out.println(randomName + ' ' + randomLastName + ' ' + randomAge);

    }
}