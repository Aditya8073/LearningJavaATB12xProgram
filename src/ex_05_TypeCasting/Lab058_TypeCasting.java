package ex_05_TypeCasting;

public class Lab058_TypeCasting {
    public static void main(String[] args) {
        long phone_no = 8073309718l;
//        short s =phone_no; // Narrowing - implicit
        short s=(short) phone_no; // Narrowing - explicit
        System.out.println(s);
    }
}
