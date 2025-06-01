package Tasks;

import java.util.Scanner;

public class Task1_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for which you want to print the table");
        int num=scan.nextInt();
        System.out.printf("%d * 1 = %d%n", num, num*1);
        System.out.printf("%d * 2 = %d%n", num, num*2);
        System.out.printf("%d * 3 = %d%n", num, num*3);
        System.out.printf("%d * 4 = %d%n", num, num*4);
        System.out.printf("%d * 5 = %d%n", num, num*5);
        System.out.printf("%d * 6 = %d%n", num, num*6);
        System.out.printf("%d * 7 = %d%n", num, num*7);
        System.out.printf("%d * 8 = %d%n", num, num*8);
        System.out.printf("%d * 9 = %d%n", num, num*9);
        System.out.printf("%d * 10 = %d", num, num*10);

    }
}
