package Exception_Coding_Assessment;

public class Challenge1_CustomException {
    public static void main(String[] args) {
        try{
            checkAge(12);
        }
        catch (InvalidAgeException e){
            System.out.println("Caught Exception: " +e.getMessage());
        }
    }
    public static void checkAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age must be 18 or above");
        }
        else{
            System.out.println("Access granted, Age is valid");
        }
    }
}
