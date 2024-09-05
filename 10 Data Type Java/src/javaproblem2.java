//Write a program to enter two numbers and perform all arithmetic operations.
import java.util.Scanner;
public class javaproblem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A Number: ");
        float a = input.nextInt();
        System.out.println("Enter B Number: ");
        float b = input.nextInt();
        
        float sum=0,sub,div,multi,mod;

        sum = a + b;
        sub = a - b;
        multi = a * b ;
        div = a / b ;
        mod = a % b ;
        
        System.out.println("Sum of a + b Number: " + sum);
        System.out.println("Sub of a - b Number: " + sub);
        System.out.println("Multipication of a * b Number:" + multi);
        System.out.println("Division of a / b Number:" + div);
        System.out.println("Mod of a % b Number:" + mod);

    }
    
}