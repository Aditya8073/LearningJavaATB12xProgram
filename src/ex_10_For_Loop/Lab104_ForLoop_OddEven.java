package ex_10_For_Loop;

public class Lab104_ForLoop_OddEven {
    public static void main(String[] args) {
        for (int i =1; i<=50; i++) {
            if(i%2==0){
                System.out.println("Even-> " +i);
            }
            else {
                System.out.println("Odd-> " +i);
            }
        }
    }
}
