package inout;

import java.io.*;

@SuppressWarnings("ALL")
public class IOOperations { // classe utilizada para abstrair os códigos de leitura e escrita das aulas anteriores permitindo utilização mais genérica por outras classes

    public static void write(Writer out, String text) throws IOException {
        out.write(text);
    }

    public static String read(Reader in) throws IOException{
        StringBuilder text = new StringBuilder();

        int c = in.read();
        while ( c > -1) {
            text.append((char) c);
            c = in.read();
        }

        return text.toString();
    }

    public static String read(BufferedReader in) throws IOException { // sobrecarga do método vai garantir um design pattern Decorator na aplicação
        String line;
        StringBuilder text = new StringBuilder();
        while ((line = in.readLine()) != null){
            text.append(line).append("\n");
        }

        return text.toString();
    }

    // Input e Output Stream trabalham com bytes por isso a sobrecarga dos métodos  read (recebe array) e write (escreve num array)
    public static byte[] read(InputStream in) throws IOException{
        return in.readAllBytes();
    }

    public static void write(OutputStream out, byte[] bytes) throws IOException {
        out.write(bytes);
    }
}
