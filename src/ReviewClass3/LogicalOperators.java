package ReviewClass3;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean loginButtonDisplayed=true;
        boolean loginButtonClickable=true;
        if(loginButtonDisplayed && loginButtonClickable){
            System.out.println("Test case is passed");
        }else{
            System.out.println("Test case failed");
        }

        System.out.println("*****************************************");

        boolean dashboard=false;
        String message="Welcome admin";

        if(dashboard || message.equals("Welcome admin")){
            System.out.println("User successfully logged in");
        }else{
            System.out.println("User is not logged in");

        }
        System.out.println("*********************************");

        boolean b=true;
        System.out.println(!true); //false
        boolean agreeCheckbox=false;

    }
}
