package class6;

public class HW {
    //Create a boolean variable workDay and assign true create int variable day and assign it to 1
    //As long as it is workDay print “I need a day off” and increase day.
    //Once day is 6 print “I do not need a day off any more”

    public static void main(String[] args) {
        boolean workDay = true;

        int day = 1;
        while (workDay) {
            if (day<=5) {
                System.out.println("I need a day off");
            }else{
                System.out.println("I do not need a day off anymore");
                workDay=false;
            }
            day++;
        }


        System.out.println("*********************************");
        //Print numbers from 1 to 100 in 1 line with space


        int n=1;
        while (n<=100){
            System.out.print(" "+n);
            n++;
        }
        System.out.println("******************HW3****************************");
        //Print numbers from 100 to 1
        int num=100;
        while (num<=100){
            if (num>=1) {
                System.out.print(" "+num);
                num--;
            }
        }

        }
    }
