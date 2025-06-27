package ex_09_Switch;

import java.util.Scanner;

public class Lab082_Switch_Without_Break {
    public static void main(String[] args) {

        System.out.println("Enter a input between 1 to 7");
        Scanner scanner= new Scanner(System.in);
        int day=scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("Mon");
            case 2:
                System.out.println("Tue");
            case 3:
                System.out.println("Wed");
            case 4:
                System.out.println("Thur");
            case 5:
                System.out.println("Fri");
            case 6:
                System.out.println("Sat");
            case 7:
                System.out.println("Sun");
            default:
                System.out.println("Invalid, day number");
        }
    }
}
