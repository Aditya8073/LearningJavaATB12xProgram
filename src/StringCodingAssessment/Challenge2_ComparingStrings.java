package StringCodingAssessment;

public class Challenge2_ComparingStrings {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="hello";
        String s3="Hello";

        boolean result= s1==s2;
        System.out.println(result);
        boolean result1=s1.equals(s2);
        System.out.println(result1);
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s2));
        int result2=s1.compareTo(s3);
        System.out.println(result2);
        System.out.println(s2.compareTo(s3));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
    }
}
