//enter temperature in Fahrenheit(°F) and convert it into °Celsius .

import java.util.Scanner;
public class javaproblem8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter temp in fahrenheit: ");
        float f = input.nextInt();

        float c;

       c = (f-32)*(float)5/9;


        System.out.println("°Fahrenheit and convert it into °Celsius : " + c );
       


    }
    
}
