package ex_11_While;

import java.util.Scanner;

public class Lab114_While_Factorial {
    public static void main(String[] args) {
        // Factorial Program

        // The logic building formula
        // Step number one, you have to figure out what is the data type for input and output.
        // Step number two, write a rough logic around this.
        // Step number three, write a proper logic around this.
        // Step number four, optimize.
        // Step number five, which is edge cases.

        System.out.println("Welcome to the Factorial Program");
        System.out.println("Enter the number whose factorial you want");
        Scanner scanner = new Scanner(System.in);

        if(!scanner.hasNextInt()){
            System.out.println("Enter a valid integer number");
            return;
        }

        int num=scanner.nextInt();
        int fact = 1;

        if(num<0){
            System.out.println("Factorial is not defined for negative numbers");
            return;
        }

//        if(num>Integer.MAX_VALUE) {
//            System.out.println("Value too large, can't get the factorial");
//            return;
//        }

            int i = 1;
            while(i<=num){
                if(fact>Integer.MAX_VALUE/i){
                    System.out.println("Factorial result is too large to be handled");
                    return;
                }
                fact=fact*i;
                i++;
            }
            System.out.println("Factorial of " +num+ " is -> "  +fact);
        }
    }

