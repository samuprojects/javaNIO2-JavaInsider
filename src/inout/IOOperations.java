package inout;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

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
}
