package ex_06_Ternary_Operator;

public class Lab064_TO_Interview_MaxOfTwoNums {
    public static void main(String[] args) {
        int x = 83;
        int y = 67;
        int result=Math.max(x,y);
        System.out.println(result);

        int result1=x>y ? x : y;
        System.out.println(result1);
    }
}
