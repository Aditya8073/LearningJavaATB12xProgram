package ex_06_Ternary_Operator;

import java.util.Scanner;

public class Lab061_TernaryOperator_P2 {
    public static void main(String[] args) {

        int num;
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        num=scan.nextInt();
        String evenOrOdd = (num%2==0) ? "It is an even number" : "It is an odd number";
        System.out.println(evenOrOdd);
    }
}
