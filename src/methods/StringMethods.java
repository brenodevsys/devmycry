package methods;

// Para podermos utilizar os métodos do String, devemos declarar uma variável e depois na hora de printa-la, utilizar os métodos mais comuns.
// toUpperCase(); toLowerCase(); charAt(posiçãoArray); lenght() que é a quantidade de char que possui;
public class StringMethods {

    public static void main(String[] args) {

        String name = "Billy Bob Joe";

        System.out.println("Name: " + name);
        System.out.println("UpperCase: " + name.toUpperCase());
        System.out.println("LowerCase: " + name.toLowerCase());
        System.out.println("First character: " + name.charAt(0));
        System.out.println("Lenght: " + name.length());
        System.out.println("last character: " + name.charAt(12));
        System.out.println("Substring: " + name.substring(10));

    }
}
