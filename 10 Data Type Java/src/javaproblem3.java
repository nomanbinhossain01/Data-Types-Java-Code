
//Write a program to enter length and breadth of a rectangle and find its perimeter.

import java.util.Scanner;
public class javaproblem3 {
    public static void main(String[] args) {
        int l, b, perimeter;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Lenght");
        l = input.nextInt();
        
        System.out.println("Enter Breadth");
        b = input.nextInt();

        perimeter = 2 *(l * b);

        System.out.println("Peramet  " + perimeter);


    
    }
    
}
