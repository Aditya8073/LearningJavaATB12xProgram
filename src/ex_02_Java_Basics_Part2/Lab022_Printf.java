package ex_02_Java_Basics_Part2;

public class Lab022_Printf {
    public static void main(String[] args) {
     int a=10;
        System.out.printf("Your variable value is: %d", a);
        // %d -> int, byte, long, short - data type
        // %s-> string
        // %f -> float, double
        // %b -> boolean

        int b=20;
        System.out.println();
        System.out.printf("a value is %d, b value is %d", a, b);
        System.out.println();
        System.out.printf("a = %d, b = %d", a, b);
        System.out.println();
        System.out.printf("a = %d, b = %d", 21, 25);
        System.out.println();
        System.out.printf("The value of pi = %f", 3.14);
    }

}
