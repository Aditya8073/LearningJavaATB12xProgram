package ex_08_If_Else_Condition;

import java.util.Scanner;

public class Lab077_If {
    public static void main(String[] args) {
        System.out.println("Enter you age");
        Scanner scan = new Scanner(System.in);
        int age=scan.nextInt();
        if(age>18){
            System.out.println("You can vote");
        }
        else {
            System.out.println("You can't");
        }
    }
}
