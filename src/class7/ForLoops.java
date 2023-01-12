package class7;

public class ForLoops {
    public static void main(String[] args) {
        /*
        prints number from 0 to 9
         */
        int num=0;//creating a variable of type int
        while(num<10){//checks the condition if condition is true execute the code in the body of while loop
            System.out.println(num);
            num++;
        }
        /*
        (initialize, condition; increment or decrement)
         */
        for(int i=0;i<10;i++){
            System.out.println(i);

        }

        //using a for loop print odd numbers from 1 to 20;

        for (int odd=0; odd<20; odd++){
            if(odd%2!=0){
                System.out.println(odd);
            }

        }
        System.out.println("***************");
        for (int i = 1; i <20 ; i+=2) {
            System.out.println(i);

        }


        }
    }

