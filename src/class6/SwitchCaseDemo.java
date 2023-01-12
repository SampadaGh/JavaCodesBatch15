package class6;

import java.util.Locale;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        String country="Italy";
      System.out.println(country.toLowerCase());

        switch (country.toLowerCase()){ //converts the text to lowercase USA changes to usa

            case "usa":
                System.out.println("Burgers");
                break;
            case "italy":
                System.out.println("pasta");
                break;
            case "afghanistan":
                System.out.println("kebab");
                break;
            default:
            System.out.println("wrong country");
        }

    }
}
