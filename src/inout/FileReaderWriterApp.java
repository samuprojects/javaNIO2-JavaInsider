package inout;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileReaderWriterApp {

    public static void main(String[] args) throws IOException {

        // gravar texto em um arquivo (output) utilizando api clássica (a maioria das classes lançam exceção, optado por lançar fora

        // informar caminho onde será salvo, se quiser, passar o append para buscar a ultima linha do arquivo (sem isso o comando vai gerar outro arquivo no lugar) e a opção de informar o charset
        try(FileWriter out = new FileWriter("src/examples/out1.txt", StandardCharsets.UTF_8)) { // IDE sugere usar try-with-resources para garantir o fechamento do canal pelo close()
            out.write("Hello!");
        }


        // agora fazendo o inverso vamos ler (INPUT) a informação a partir do arquivo de saída gerado anteriormente
        try (FileReader in = new FileReader("src/examples/out1.txt", StandardCharsets.UTF_8)) {
            int c = in.read(); // porque o read() retorna um int (ver documentação)
            StringBuilder text = new StringBuilder(); // alternativa ao código do printl com char diretamente
            while (c > -1) { // porque o retorno do read() após a leitura do caractere é -1
                //System.out.print((char)c); // mostra o número do caractere lido em formato int, podemos fazer um casting explícito para char e imprimir tudo na mesma linha
                text.append((char) c); // alternativa para a linha acima que gera o texto completo ao final da iteração e imprime fora do bloco while
                c = in.read(); // faz a leitura do pŕoximo
            }
            System.out.println(text);
        }   // utilizando o FileReader realizamos a abordagem de ler o arquivo caractere a caractere

        /*
        * cópia do registro de ajuda de colegas no fórum que agregam a este cenário
        *
        * Dúvida: Testei juntar as duas operações em um só try-with-resources por curiosidade,
        * só que não exibiu no console o texto “Hello!“ que era pra ter gravado no arquivo, eu imagino que deve ser por
        * causa que quando o programa ler, a operação de escrita ainda não foi finalizada, pq o close só acontece ao
        * final da execução do bloco, por isso que só dá certo quando se separa em dois blocos try, estou certo?
        *
        * Resposta: Nesse caso tem que ser dois try-with-resources separados (um fora do outro),
        * pois primeiro a operação de escrita deve ser finalizada para que depois a operação de leitura
        * entre em ação a fim de ler o arquivo e o programa mostrar o conteúdo do mesmo no console.
        * Mesmo que você tente utilizar dois try-with-resources (um dentro do outro), também não funciona, apesar do código compilar.
         * */

    }
}
