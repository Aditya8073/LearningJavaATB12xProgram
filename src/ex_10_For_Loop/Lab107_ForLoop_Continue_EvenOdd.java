package ex_10_For_Loop;

public class Lab107_ForLoop_Continue_EvenOdd {
    public static void main(String[] args) {
        for (int i = 0; i < 50 ; i++) {
            if(i%2==0){
                continue;
            }
            System.out.println("Odd-> " +i);

        }
    }
}
