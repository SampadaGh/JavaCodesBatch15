package class8;

public class BreakKeywordDemo1 {
    public static void main(String[] args) {
        boolean summer=true;
        int temp=75;
        while(summer){
            if(temp<=100){
                System.out.println("I love summer because temperature is "+temp);
            }else{
                System.out.println("its very hot "+temp);
              break;

            }
            temp+=5;

        }
        //can be done without break if we use while (temp<=105)
    }
}
