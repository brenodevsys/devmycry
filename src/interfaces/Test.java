package interfaces;
// Foi implementado dentro do nome da classe Test as interfaces: Car, Audio.
// Após isso, será feita a saolictação de Implement methods para poder utilizar os métodos padrões e dar dinamica  valores pra ele dentro do Main.
//
public class Test implements Car, Audio {

    public static void main(String[] args) {

        Car car1 = new Car() {
            @Override
            public void go() {
                System.out.println("Starting the engine!");
            }

            @Override
            public void stop() {
                System.out.println("Stoping the engine");
            }
        };
        car1.go();
        car1.stop();
    }

    @Override
    public String aumentarVolume() {
        return null;
    }

    @Override
    public String abaixarVolume() {
        return null;
    }

    @Override
    public String desligarSom() {
        return null;
    }

    @Override
    public void go() {

    }

    @Override
    public void stop() {

    }
}
