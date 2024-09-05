//a program to convert days into years, weeks and days.

import java.util.Scanner;
public class javaproblem9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter days:");
        
        int days = input.nextInt();

        int years, months, weeks, day;
        years=days/365;
        months=(days % 365)/30;
        weeks=(days % 365 % 30)/7; 
        day=(days % 365 % 30 % 7);

        System.out.println(("Years: " + years));
        System.out.println("Month: " + months);
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " +day);

    }
}

