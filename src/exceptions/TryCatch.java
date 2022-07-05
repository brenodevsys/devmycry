package exceptions;

import java.rmi.server.ExportException;
import java.util.Scanner;
// utilizamos try para tentar um método, soma, ou variáveis que talvez venham a trazer exceções.
// após isso utilizamos o catch e dentro dos parametros colocamos a exceção e a declaração dela com e. E caso queira printar algo na tela pode soltar um sysout*
public class TryCatch {

    public static void main(String[] args) {

        try{
            int[]a = {4};

            System.out.println(a[1]);

        } catch (NullPointerException e) {
            System.out.println("Your array is null, sorry!");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Your index is out of bounmd!");
        } catch (Exception e) {
            System.out.println("Something wen wrong!");
        }


    }
}
