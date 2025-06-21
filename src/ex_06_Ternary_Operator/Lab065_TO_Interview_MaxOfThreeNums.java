package ex_06_Ternary_Operator;

public class Lab065_TO_Interview_MaxOfThreeNums {
    public static void main(String[] args) {

        int n1 = 25;
        int n2 = 6;
        int n3 = 48;

        //Logic Building formula

        //Step 1 -> Find the input and output data types
        //I/P -> n1,n2,n3 -> int
        //O/P -> max number or String we can message with max number

        //Step 2 -> Build a rough logic
        // n1 > n2 && n1 > n3 then max=n1
        // n2 > n1 && n2 > n3 then max=n2
        // max = n3

        //Step 3
        //Write the actual logic
        int max=(n1>n2) && (n1>n3) ? n1 : ((n2>n1) && (n2>n3)) ? n2 : n3;
        System.out.println(max);
    }
}
