package inout;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufferedReaderWriterApp {

    public static void main(String[] args) throws IOException {


        // Com a utilização do Buffer podemos agrupar as informações de leitura ou escrita para entrega de uma só vez (flush)
        // Isso é importante porque é computacionalmente custoso ler ou escrever cada caracatere individualmente
        // a sobrecarga do método write e read na classe IOOperations para incluir operações com Buffer garante ainda novos comportamentos aos objetos
        //  já utilizados nos outros exemplos ganhando em performance. Isso representa a utilização de um design pattern conhecido como Decorator
        // exemplo FileWriter tem um comportamento adicionando ele dentro de um BufferedWriter vai agrupar as informações para depois salvar de uma vez (novo comportamento)
        // a mesma coisa para o FileReader (lê byte a byte) com o Buffered poderá ler agrupado em linhas permitindo ler linhas diretamente.

        try (BufferedWriter out = new BufferedWriter(new FileWriter("src/examples/out1.txt", StandardCharsets.UTF_8))) {
            IOOperations.write(out, "Hello!");
            out.flush();
        }

        try (BufferedReader in = new BufferedReader(new FileReader("src/examples/out1.txt", StandardCharsets.UTF_8))) {
            String text = IOOperations.read(in);
            System.out.println(text);
        }

    }
}
