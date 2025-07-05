package Exception_Coding_Assessment;

public class Challenge2_Try_Catch_Finally {
    public static void main(String[] args) {
        try{
            division(10,0);
        } catch (Exception e) {
           //throw new RuntimeException(e);
           System.out.println("Cannot divide by zero");
        }
        finally{
            System.out.println("Finally block executed");
        }
    }

    public static void division(int a,int b){
        int result=a/b;
        System.out.println(result);
    }
}
