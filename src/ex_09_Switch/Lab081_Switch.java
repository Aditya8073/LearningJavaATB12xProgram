package ex_09_Switch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab081_Switch {
    public static void main(String[] args) {

        System.out.println("Enter the day between 1 to 7");
        Scanner scanner = new Scanner(System.in);
        try{
            int day=scanner.nextInt();
        switch (day){
            case 1:
                System.out.println("It is monday");
                break;
            case 2:
                System.out.println("It is tuesday");
                break;
            case 3:
                System.out.println("It is wednesday");
                break;
            case 4:
                System.out.println("It is thursday");
                break;
            case 5:
                System.out.println("It is friday");
                break;
            case 6:
                System.out.println("It is saturday");
                break;
            case 7:
                System.out.println("It is sunday");
                break;
            default:
                System.out.println("Enter valid day from 1 to 7 only");
        }
        }
        catch (InputMismatchException e){
            System.out.println("Please enter a valid integer between 1 to 7");
        }
        finally {
            scanner.close();
        }
    }
}
