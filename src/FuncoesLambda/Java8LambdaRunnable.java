package FuncoesLambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Java8LambdaRunnable {

    public static void main(String[] args) {

        //Criação de Thread sem função lambda
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Olá mundo!");
            }
        }).start();

        //Criação de Thread utilizando funções lambda
        //SAM - Single Abstract Method -> Qualquer interface que contenha apenas um método abstrato.
        //@FuncionalInterface annotation encima do Runnable é indicação da SAM, apenas 1 unico método abstrado.
        new Thread(() -> System.out.println("Olá mundo!")).start();

    }
}
