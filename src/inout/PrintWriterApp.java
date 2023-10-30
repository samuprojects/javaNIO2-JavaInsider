package inout;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class PrintWriterApp {

    public static void main(String[] args) throws IOException {

        // uma classe muito utilizada que possui vários métodos de escrita (tanto diretamente no arquivo quanto na tela) é o PrintWriter
        try (PrintWriter out = new PrintWriter("out.txt", StandardCharsets.UTF_8)){ // não esquecer de fechar com autoflush, ou close(), ou try-with-resources
            out.println("Olá");
            out.println("tudo bem?");
            out.println("eu sou o Java!");
            out.format("número: %03d", 10);
        }
    }
}
