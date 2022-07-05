package MultiThreading;


//As Threads funcionam de forma continua e simultânea, podemos utilizar como extends Thread do java lan e posterioremente usar .start(); ou o
//Thread.sleep(millis: 1000) milisegundos, 1 segundo, para poder dar um delay e carregar de forma mais lenta os outputs e prints.
public class MultiTreaded extends Thread{

    public static void main(String[] args) throws InterruptedException {

        MultiTreaded mt = new MultiTreaded();
        mt.start();

        for (int j = 0; j <= 200; j++) {
            System.out.print("j: " + j + "\t");
            Thread.sleep(1000);
        }
        


    }

    public void run(){
        for (int i = 0; i<=200; i++){
            System.out.print("i: " + i + "\t");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Child Thread Exiting...");
            }
        }
    }
}

