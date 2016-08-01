package newpackage;

import java.awt.*;
import java.util.Scanner;

/**
 * Created by PC on 21.07.2016.
 */
public class One {
    public static void main (String args []){
        System.out.println("Enter 1 or 2 or 3");
        Scanner scanner = new Scanner(System.in);
                int input = scanner.nextInt();
        switch (input){
            case 1 : System.out.println("you enter nomber 1");
                break;
            case 2 : System.out.println("you enter nomber 2");
                break;
            case 3 : System.out.println("you enter nomber 3");
                break;
            default: System.out.println("You have made incorrect choice");

        }

    }
}
