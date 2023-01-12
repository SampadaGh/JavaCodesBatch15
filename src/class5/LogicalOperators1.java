package class5;

public class LogicalOperators1 {
    public static void main(String[] args) {

        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||false);

        System.out.println(false||true|false|false);



        boolean broughtCho=false;
        boolean broughtFlowers=false;
        if(broughtCho||broughtFlowers){
            System.out.println("I am happy");
        }else{
            System.out.println("i am sad");
        }

        boolean wifi=false;
        boolean fiveG=false;
        if(wifi||fiveG){
            System.out.println("you are good for browsing the internet");
        }else{
            System.out.println("No connection");
        }


    }
}
