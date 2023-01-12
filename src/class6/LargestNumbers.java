package class6;

import java.util.Scanner;

public class LargestNumbers {
    //Write a program to find largest of three double values using if-else..
    // if and logical operators provided by a user (numbers must be distinct)
    public static void main(String[] args) {
        double number1, number2,number3;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter 3 numbers");
        number1=scan.nextDouble();
        number2=scan.nextDouble();
        number3=scan.nextDouble();
        if (number1>number2 && number1>number3){
            System.out.println("The largest number is "+ number1);
        }else if (number2>number1 && number2>number3){
            System.out.println("The largest number is "+ number2);
        }else if(number3>number1 && number3>number2){
            System.out.println("the largest number is "+ number3);
        }else{
            System.out.println("please enter distinct numbers");
        }
    }
}
