package class6;

import java.util.Scanner;

public class EnterCountryHW {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the name of your country");
        String country=scan.next();

        switch (country){
            case "USA":
                System.out.println("English");
                break;
            case "Nepal":
                System.out.println("Nepalese");
                break;
            case "Pakistan":
                System.out.println("urdu");
                break;
            case "Germany":
                System.out.println("German");
                break;
            default:
                System.out.println("Wrong country");
        }


    }
}
