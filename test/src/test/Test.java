package test;
//Package For Scanner Number By User
import java.util.Scanner;

public class Test {
    
    public static void main(String[] args) {
        //Program Java Language 1951
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter Number One: ");
        int x=sc.nextInt();
        System.out.print("Enter Number Two: ");
        int m=sc.nextInt();
        int sum=x+m;
        System.out.println("Sum= "+sum);
    }
    
}
