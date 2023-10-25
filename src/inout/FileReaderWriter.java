package inout;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileReaderWriter {

    public static void main(String[] args) throws IOException {

        // gravar texto em um arquivo (output) utilizando api clássica (a maioria das classes lançam exceção, optado por lançar fora

        // informar caminho onde será salvo, se quiser, passar o append para buscar a ultima linha do arquivo (sem isso o comando vai gerar outro arquivo no lugar) e a opção de informar o charset
        try(FileWriter out = new FileWriter("src/examples/out1.txt", StandardCharsets.UTF_8)) { // IDE sugere usar try-with-resources para garantir o fechamento do canal pelo close()
            out.write("Hello!");
        }
    }
}
