package ex_05_TypeCasting;

public class Lab057_TypeCasting {
    public static void main(String[] args) {
        int val = 300;
//      byte b = val; //Narrowing - Implicit
        byte b1 = (byte)val; //Narrowing - Explicit
        System.out.println(b1); //44
    }
}
