package ex_09_Switch;

public class Lab090_JDK_13Above {
    public static void main(String[] args) {

        int itemCode = 004;
        switch (itemCode){
            case 001,003,005:
                System.out.println("All of them are electronic gadgets");
                break;
            case 002,004,006:
                    System.out.println("Thi is hardware");
                    break;
            default:
                System.out.println("None");
                break;
        }
    }
}
