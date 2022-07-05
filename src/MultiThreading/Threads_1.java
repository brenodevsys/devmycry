package MultiThreading;


// Thread t = thread.curretnThread(); -> aqui será instanciado a thread current para uma variável t, e assim conseguimos saber qual será a thread atual rodando no nossso programa.
// utilizamos t. os métodos disponívels do curtentThread, no caso pra ppegar o nome é t.getName(); Foi impresso "main", que é a Thread principal
// Thread são LINHAS de execução, que são alocadas no nucleo dos processadores, a partir de onde ele inicia o projeto.

public class Threads_1 {
    // No caso a thread principal do método mais é o *main*
    public static void main(String[] args) {
        //Saber a Thread que estamos, a Thread atual.
        Thread t = Thread.currentThread();
        System.out.println(t.getName());

        MeuRunnable meuRunnable = new MeuRunnable(); //Pra melhorar o código, podemos instanciar a Classe MeuRunnable em uma variável e utilizar ela dentro dos (parâmetros)
        //... de execução de cada thread nova.

        //Nova Thread, como criá-las
        // Instanciar uma nova thread, para utilizar ela precisamos ter a interface RUNNABLE ou RUN();
        // Dentro dos parâmetros eu instancia um novo MeuRunnable que irá puxar o run() do implements Runnable, 3 etapas.
        // PARA DE FATO CRIAR UMA THREAD NOVA em nosso programa, precisamos utilizar o método .start(); -> instruindo a JVM(java) para chamar o método run() qnd possível.
        Thread t1 = new Thread(meuRunnable); //aqui na instanciação da Thread, passamos o meuRunnable para poder rodar o método run.
        //t1.run(); //apenas executando na mesma thread


        //Runnable utilizando função lambda
        Thread t2 = new Thread(() ->
                System.out.println(Thread.currentThread().getName())); // Ao invés de passar uma implentação do new MeuRunnable(), iremos utilizar lambda


        // Várias Threads, criar várias linhas de exec paralalemente em nosso processador(nucleos)
        Thread t3 = new Thread(meuRunnable); // O msmo Runnable pode ser executado várias vezes em Threads diferentes, criando instancias de Runnable.

        //Abaixo de todo código de Threads criada, nós podemos executalos(cria-los) todos juntos abaixo com o .start();
        t1.start(); //executando em uma nova thread. **AQUI SAO 2 LINHAS DE EXECUÇÃO** separadas.
        t2.start(); //usando lambda, não é necessário criar uma nova classe e implementar método dentro dela com outputs diferentes como println, por exemplo.
        //t2.start(); **NÃO É POSSÍVEL INICIAR A MESMA THREAD 2x, APENAS 1x. ELA LANÇA EXECÇÃO!!!!!
        t3.start();




    }
}
