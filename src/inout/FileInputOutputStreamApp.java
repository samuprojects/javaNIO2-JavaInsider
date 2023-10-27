package inout;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamApp {

    public static void main(String[] args) throws IOException {

        // InputStream = canal de entrada onde conseguimos ler bytes
        // FileInputStream significa que o canal de entrada é um arquivo

        try (
                FileInputStream in = new FileInputStream("src/examples/file2.txt");
                FileOutputStream out = new FileOutputStream("src/examples/file3.txt")
        ){
            byte[] bytes = IOOperations.read(in); // lê completamente o arquivo de entrada (estão na memória)
            IOOperations.write(out, bytes); // grava as informações do arquivo de entrada no arquivo de saída (gerando uma cópia)

            // trabalhar com bytes permite operar com qualquer tipo de arquivo e nesse cenário podemos copiar de um lado para outro como no exemplo
        }

    }
}
