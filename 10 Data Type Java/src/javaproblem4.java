
//Write a program to enter length and breadth of a rectangle and find its area.

import java.util.Scanner;
public class javaproblem4 {
    public static void main(String[] args) {
        int l, b, area;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Lenght");
        l = input.nextInt();
        
        System.out.println("Enter Breadth");
        b = input.nextInt();

        area = l * b;

        System.out.println("Area  :" + area);


    
    }
    
}
