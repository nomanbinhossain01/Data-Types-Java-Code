
//enter radius of a circle and find its diameter, circumference and area.

import java.util.Scanner;
public class javaproblem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Radius: ");

        float r = input.nextInt();

        float d, c, a;
        d = 2 * r;
        c = (float)(2*3.1416*r);
        a = (float)(3.1416 * r * r);

        System.out.println("Diameter: " + d);
        System.out.println("Circuference: "+ c);
        System.out.println("Area :"+ a);

    
    }

    
}
