package ex_04_Operators;

public class Lab041_Interview_Concat {
    public static void main(String[] args) {
        String first_name = "Aditya";
        String last_name = "Verma";

        int a=10;
        int b=20;

        System.out.println(first_name + last_name + a + b);
        System.out.println(a+b+first_name+last_name);
        System.out.println(first_name+last_name+ (a+b));

        // BODMAS - Bracket of Div, mul, add, sub
    }
}
