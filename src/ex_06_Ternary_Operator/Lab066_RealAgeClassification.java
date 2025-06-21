package ex_06_Ternary_Operator;

public class Lab066_RealAgeClassification {
    public static void main(String[] args) {

        // age =27 -> Minor<18 , Adult > 18 , Senior > 65
        String user_input=args[0];
        System.out.println(user_input instanceof String);
        System.out.println(user_input);

        int age=Integer.parseInt(user_input);
        System.out.println(age);

        String result= (age<18) ? "Minor" : (age<65) ? "Adult" : "Senior";
        System.out.println(result);

    }
}
