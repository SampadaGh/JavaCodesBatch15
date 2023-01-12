package class5;

import java.sql.SQLOutput;
import java.util.Scanner;

    public class ScannerDemo1 {
        public static void main(String[]args) {
            Scanner scan=new Scanner(System.in);
            double weight;
        /*
        Scanner=>Name of the class
        scan is just a variable like we create primitive variables
        = assignment operator
        System.in => tells computer we want to read the data from keyboard in console

            System.out.println("Please Enter your age");
            int age=scan.nextInt();
            System.out.println("You are"+age+" Years old");
            sout

         */
           /* System.out.println("Please Enter your gender");
            char gender=scan.next().charAt(0); //char type of input
            System.out.println("Your gender is "+gender);*/

            System.out.println("Pleas enter your name");
            String name=scan.next();
            System.out.println("your name is "+name);

            scan.nextLine(); //trick to make nextLine method work after we have used any other method from
            //scanner class
            System.out.println("Please Enter your full name");
            String fullName=scan.nextLine();
            System.out.println("Your full name is "+fullName);
            scan.close(); //good practice
        }
    }


