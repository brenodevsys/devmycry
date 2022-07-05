package methods;

import java.util.Scanner;

// para criação de métodos, devemos utilizar -> public static void(parâmetros de divisao ou que seja) {}, caso seja um método que vá retornar algo fixo, não utilizamos void.
// os métodos podem ser feitos em classes ou ***FORA DO MÉTODO MAIN***
public class Methods {

    public static void main(String[] args) {
    // Aqui você pode utilizar todos métodos sem precisar criar variaveis.

    }
    public static void auau() {
        System.out.println("Auauauau");
    }

    public static void welcome() {
        System.out.println("Weolcome to our calculator!");
    }

    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public static void divide(int a, int b) {
        System.out.println(a / b);

    }

    public static void sum(int a, int b) {
        System.out.println(a + b);

    }



}
