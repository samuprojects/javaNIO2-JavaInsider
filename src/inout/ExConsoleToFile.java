package inout;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Scanner;

public class ExConsoleToFile {

    public static void main(String[] args) throws IOException {

        Path pathOut = Path.of("console.txt"); // caminho do arquivo a ser criado

        System.out.println("Olá! digite seu texto e pressione ENTER para pŕoxima linha.");

        try (PrintWriter out = new PrintWriter(pathOut.toFile())) { // existem várias possibilidades, aqui escreve no arquivo
            while (true) { // fica em loop infinito até a condição para o break
                Scanner in = new Scanner(System.in); // System.in para ler do console
                System.out.print(">> "); // indicador do cursor para visualização pelo usuário
                String line = in.nextLine(); // lê linha a linha

                if(line.isEmpty()){ // caso a linha esteja em branco encerra o loop ao usuário pressionar ENTER
                    break;
                }

                out.println(line); // escrever a informação salva no arquivo

            }
        }
    }

}
