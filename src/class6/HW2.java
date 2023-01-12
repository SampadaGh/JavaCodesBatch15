package class6;

public class HW2 {
    //Print even numbers from 20 to 1 (2 ways)
    public static void main(String[] args) {


        int even = 20;
        while (even >= 1) {
            if (even % 2 == 0) {
                System.out.println(even);
            }
            even--;
        }
    }
}