package exceptions;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {

        int a, b, c;
        System.out.println("Enter two integers: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = a / b;
        System.out.println("Result is: " + c);






        sc.close();

    }
}
