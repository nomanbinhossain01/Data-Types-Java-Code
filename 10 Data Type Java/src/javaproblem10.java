//a program to find power of any number x ^ y.

import java.util.Scanner;
public class javaproblem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter temp in Base: ");
        float b = input.nextInt();
        
        System.out.println("Enter temp in power: ");
        float p = input.nextInt();

        float r;

        r = (float) Math.pow(b, p);

        System.out.println("power of any number x ^ y is : " + r);

       
       


    }
    
}
