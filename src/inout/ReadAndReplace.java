package inout;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;

@SuppressWarnings("ALL")
public class ReadAndReplace {

    public static void main(String[] args) throws IOException {

        try (
                var in = new BufferedReader(new FileReader("src/examples/data.in")); // para ler o arquivo de entrada indicado
                var out = new PrintWriter(Path.of("src/examples").resolve("data.out").toFile()) // para gravar o arquivo de saída indicado
        ) {
            String line;
            while ((line = in.readLine()) != null) { // condição "enquanto existir linhas para ler...", realizar a leitura

                line = line.replace(".", ".\n"); // vai substituir tudo que encontrar com "ponto" para quebra de linha, armazenando na própria linha

                out.println(line); // para escrever o conteúdo da linha no arquivo de saída realizando as quebras no token iodentificado
            }
        }
    }
}
