package ex_09_Switch;

import java.util.Scanner;

public class Lab083_Switch_Automation {
    public static void main(String[] args) {
        System.out.println("Enter the browser name");
        Scanner scanner = new Scanner(System.in);
        String browser=scanner.next();
        browser=browser.toLowerCase();
        switch (browser){
            case "chrome":
                System.out.println("Starting the chrome browser");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                break;
            case "edge":
                System.out.println("Starting the edge browser");
                break;
            default:
                System.out.println("Enter a valid browser name");
                break;
        }
    }
}
