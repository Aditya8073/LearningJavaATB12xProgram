package ex_10_For_Loop;

public class Lab105_ForLoop_Break {
    public static void main(String[] args) {
        for (int i=0;i<50;i++){
            //System.out.println(i); // 1 to 5
            if(i==5){
                //System.out.println(i); // 5
                break;
            }
            System.out.println(i);
        }
    }
}
