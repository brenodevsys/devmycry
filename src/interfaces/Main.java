package interfaces;
// No momento de utilizarmos a Classe main onde possuimos o método de incio de codigo "main", implementamos a Interface Garrafa
//... para aqui podermos darmos valores e dinamica aos métodos e objetos da mesma.
//... a própria IDE irá reclamar de um erro, solicitando a implementação dos métodos da interface garrafa, gerando um @Override dos methods.
//... preste atenção que os métodos da Interface são colodaos fora do método main.
// Dentro do método main, após instanciarmos uma nova garrafa via Interface, será apresentado novamente a implementação padrão e como desejamos agregar valor aos métodos
//... já existentes da Garrafa.
public class Main implements Garrafa{

    public static void main(String[] args) {

        System.out.println(cor);

        Garrafa garaffa1 = new Garrafa() {
            @Override
            public void encher() {
                System.out.println("Enche muito!");
            }

            @Override
            public void esvaziar() {
                System.out.println("Esvaziar tudo!");
            }
        };

        garaffa1.encher();
        garaffa1.esvaziar();


    }


    @Override
    public void encher() {

    }

    @Override
    public void esvaziar() {

    }
}
