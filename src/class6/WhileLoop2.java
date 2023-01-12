package class6;

public class WhileLoop2 {
    public static void main(String[] args) {
        int number = 1;
        while (number < 5) {
            System.out.println(number);
            number++;
        }
        System.out.println("**********");
        int number2 = 0;
        while (number2 < 10) {
            System.out.println(number2);
            number2 += 2;
        }
        //write a loop to print numbers from 1 to 100
        //write a loop to print odd numbers from 1 to 15
        //write a loop to print these numbers 5,10,15,20,25,30......50

        int numbers=1;
        while(number<=100){
            System.out.println(number);
            number++;
        }
        int odd=1;
        while(odd<=15){
            System.out.println(odd);
            odd+=2;
        }
        int five=5;
        while(five<=50){
            System.out.println(five);
            five+=5;
        }

    }
}