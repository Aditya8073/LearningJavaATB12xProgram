package ex_05_TypeCasting;

public class Lab059_TypeCasting {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
//        int total = course+GST; // Narrowing - Implicit
        int total = course+(int)GST; // Narrowing - Explicit
        System.out.println(total);

        float total1=course+GST; // Widening - Implicit
        float total2 = (float) course+GST; // Widening - Explicit
        System.out.println(total1);
    }
}
