package ex_03_Literals;

public class Lab032_Char_Literal {
    public static void main(String[] args) {
        char c1='A'; // A to Z, a-z, !@#$%^&*()_+
        //char c = "A"; //"" = String->bunch or chars

        char c2='B';
        char c3='@';
        char c4='d';
        char c5='_';
        char c6='9';
        char c7='(';
        char c8=' ';

        //Escape char
        char newLine = '\n';
        char tabLine = '\t';
        char backSpace = '\b';
        char carriage_return = '\r';

        System.out.println("AdityaVerma");
        System.out.println("Aditya"+newLine+"Verma");
        System.out.println("Aditya\nVerma");
        System.out.println("Aditya"+tabLine+"Verma");
        System.out.println("Aditya"+backSpace+"Verma");
        System.out.println("Aditya is "+carriage_return+"Verma");
        System.out.println("-----------------------");

        System.out.println("Hello, this is first line"+newLine+"This is second line\nThis is third line");

        char c9='A';
        // ASCII, (limited numbers) - A -> 65
        System.out.println(c9+10); //75

        char rupees='₹';
        System.out.println(rupees);

        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);
    }
}
