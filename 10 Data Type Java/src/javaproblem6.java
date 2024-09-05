
//enter length in centimeter and convert it into meter and kilometer.

import java.util.Scanner;
public class javaproblem6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter centimeter: ");
        float cm = input.nextInt();

        double m, km;

        m = (double) cm/100;
        km = (double) cm/1000;

        System.out.println("Meter : " + m );
        System.out.println("Kilometer : " + km);


    }
    
}
