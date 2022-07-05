package interfaces;


//Dentro da interface, podemos criar os atributos e métodos de uma garrafa como no exemplo;
// Sendo assim, as interfaces tem como padrão seus métodos e deixa a caráted da Classe implementadora a atribuição de valores e dados para os métodos e atributos pré-fixados.
// Exemplo, na nossa interface Garrafa, um atributo de cor padrão que é azul, e 2 métodos, um de encher e outro de esvaziar, quando implementado em uma classe a interface Garrafa,
//...devemos atribuir aos métodos encher e esvaziar como será o valor dela, pegando as assinaturas da interface e dando comportamentos à ela.
public interface Garrafa {

    String cor = "Azul";
    void encher();
    void esvaziar();

}
