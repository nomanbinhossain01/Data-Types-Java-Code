//temperature in °Celsius and convert it into °Fahrenheit.

import java.util.Scanner;
public class javaproblem7 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter temp in °Celsius: ");
        float c = input.nextInt();

        float f;

       f = (float)(1.8* c)+32;


        System.out.println("°Celsius and convert it into °Fahrenheit : " + f );
       


    }
}
