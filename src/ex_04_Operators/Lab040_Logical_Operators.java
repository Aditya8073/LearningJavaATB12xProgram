package ex_04_Operators;

public class Lab040_Logical_Operators {
    public static void main(String[] args) {

        boolean a = true;
        System.out.println(!a);

        boolean b = false;
        System.out.println(a||b);
        System.out.println(a&&b);
        System.out.println(!!a);

        boolean c=true || false;
        boolean c1=false || false;
        System.out.println(c);
        System.out.println(c1);

        boolean d=true && true;
        System.out.println(d);

    }
}
