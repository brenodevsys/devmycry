package interfaces;

public class Honda implements Car{
    @Override
    public void go() {
        System.out.println("Inside Hondas Go");
    }

    @Override
    public void stop() {
        System.out.println("Inside Hondas Stop");
    }

    public void brake(){
        System.out.println("Brakinggggg,....");
    }
}
