package Product_Menu.Order;

import java.util.Scanner;

public class Order{
    String burger = "burger" ;
    String pizza = "pizza" ;
    String drink = "drink" ;
    String combo = "combo" ;

    Scanner sc = new Scanner(System.in);

    public void productChooser() {
        String userInput = sc.next();
        if (userInput == burger) {
            System.out.println("one burger price is 5 euros");
        } else if (userInput == pizza) {
            System.out.println("one pease of pizza price is 6 euros");
        } else if (userInput == drink) {
            System.out.println("");
        } else if (userInput == combo) {
            System.out.println("");
        }
    }
}




