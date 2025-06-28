package StringCodingAssessment;

public class Challenge3_StringConcatenationPerformace {
    public static void main(String[] args) {
        String s="Aditya";
        for (int i=0; i<1000;i++){
            s= s.concat(" Verma");
            System.out.println(s);
        }

        StringBuffer s1=new StringBuffer("Aditya");
        for (int i=0; i<1000;i++){
            System.out.println(s1.append(" Verma"));
        }

        StringBuilder s2=new StringBuilder("Aditya");
        for (int i=0; i<1000;i++) {
            System.out.println(s2.append(" Verma"));
        }
    }
}
