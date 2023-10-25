package inout;

import java.io.*;

public class StringReaderWriterApp {

    public static void main(String[] args) throws IOException {

        // Como a classe IOOperations está abstraída genericamente utilizando a super classe Writer e Reader o polimorfismo vai garantir que os métodos se comportem de acordo com o objeto utilizado

        try (Writer out = new StringWriter()){
            IOOperations.write(out, "Hello!");
            System.out.println(out);
        }

        try (Reader in = new StringReader("Qualquer coisa!")){
            String text = IOOperations.read(in);
            System.out.println(text);
        }
    }
}
