package MultiThreading;

public class MeuRunnable implements Runnable{

    //Na criação da classe Meu Runnable, aqui implementamos a classe pré existente Runnable do Java.lan
    // Dentro da nossa classe, criaremos o método run de forma simples como abaixo;
    //Para podermos sabermos qual linha(thread) criada, dentro do método declaramos uma variável chamada name recebendo o método
    //... Thread.currentThread().getName(); e printamos nossa variável nome. Para quando chamarmos em nossa classe principal onde está o método MAIN
    //... ser possível visualizar nossa thread.
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name);
    }
}
