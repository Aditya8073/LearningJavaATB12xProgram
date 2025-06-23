package Tasks;

import java.util.Scanner;

public class Task4_TriangleClassifier {
    public static void main(String[] args) {
        System.out.println("Enter the length of side1");
        Scanner scan = new Scanner(System.in);
        int side1=scan.nextInt();
        System.out.println("Enter the length of side2");
        int side2=scan.nextInt();
        System.out.println("Enter the length of side3");
        int side3=scan.nextInt();

        if(side1==side2 && side2==side3){
            System.out.println("It is an equilateral triangle");
        } else if (side1==side2 || side2==side3 || side3==side1) {
            System.out.println("It is an  isosceles triangle");
        }
        else {
            System.out.println("It is a scalene triangle");
        }

    }
}
