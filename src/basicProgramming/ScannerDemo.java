package basicProgramming;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //creating an object of scanner class
        /*System.out.println("Enter a number");
        int number = sc.nextInt();
        System.out.println("the number is " + number);



        System.out.println("enter string");
        String s = sc.nextLine();
        System.out.println("the string is " + s);
         */

        boolean b = sc.nextBoolean();
        System.out.println("boolean value " + b);

    }
}
