package Tasks;

import java.util.Scanner;

public class Task1_ForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for which you want to print the table");
        int num=scan.nextInt();
        for(int i=1;i<=10;i++){
            System.out.printf("\n%d x %d = %d", num, i, num*i);
        }

    }
}
