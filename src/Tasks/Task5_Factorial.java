package Tasks;

import java.util.Scanner;

public class Task5_Factorial {
    public static void main(String[] args) {
        System.out.println("Please enter a number to calculate its factorial:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int fact=1;
        if(n==0){
            fact=1;
        }
        if(n>Integer.MAX_VALUE){
            System.out.println("This number can't be handled");
        }

        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of " +n + " is " +fact);
    }
}
