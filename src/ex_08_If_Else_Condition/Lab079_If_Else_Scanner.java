package ex_08_If_Else_Condition;

import java.util.Scanner;

public class Lab079_If_Else_Scanner {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner scan = new Scanner(System.in);
        int age=scan.nextInt();
        if(age>18)
            System.out.println("You can go to GOA!!!");
        else
            System.out.println("You are not allowed");
    }
}
