package FuncoesLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// API DE STREAM
// STREAM - fluxo de dados
//.skip(4) -> operação intermediária
//.limit(2) -> vai limitar a quantidade de dados ou numeros de uma lisa em até 2, será impresso o limite de 2.
//.distinct() -> Ele é utilizado para ignorar os elemetnso repetidos e imprimir apenas uma vez que foi selecionado. Utiliza o equals and hashcodes
//.filter() -> forma personalizada para filtrar os dados a serem passados antes da impressão no forEach
//.map(e -> e * 2) -> transformação de dados***, no caso ele transformou os dados já pre definidos na lista e muiltiplicou todos por 2 utilizando função Lambda.
// a lista original nao será modificada, será apenas no dado de stream, apenas será uma transformação superficial do stream().map(modificação apenas aqui.)

public class Java8LambdaStreams {


    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);
        // Java 8 utilizamos as STREAMS
        // Stream é fluxo de dados, diferente de iteração. Cada dado é um numero da lista acima, que percore o Stream.
        lista.stream()
                .map(e -> e*2)
                .forEach(e -> System.out.println(e));

    }
}
