package ex_06_Ternary_Operator;

public class Lab063_Ternary_Operator_P4 {
    public static void main(String[] args) {

        //Nested Ternary
        // Condition1 ? expression1 : (Condition2 ? expression2 : expression3);

        int age = 27;
        String result=(age > 18) ? (age>25 ? "You can drink" : "You can't drink") : "You can't go to Goa";
        System.out.println(result);
    }
}
