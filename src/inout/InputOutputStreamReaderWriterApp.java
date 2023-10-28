package inout;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputOutputStreamReaderWriterApp {

    private static final byte[] BYTES = {
            106, 97, 118, 97, 32, 114, 111, 99, 107, 115, 33, 32, 92, 111, 47
    };

    public static void main(String[] args) throws IOException {


        /*Supondo que esse array de bytes representa um texto codificado em UTF-8 com origem externa qualquer e precisamos transformar isso num texto
        * codificado em UTF-8 para ser lido dentro da aplicação.
        * Para fazer a leitura, em texto, de dados que estão em bytes precisamos usar classes que tem o sufixo READER, porém para cumprir com o objetivo
        * será necessário criar uma ponte entre o InputStream (que só possuem métodos que retornam bytes) e Reader (que trabalha com texto).
        * Vamos utilizar um tipo especial de Reader chamado InputStreamReader passando a InputStream (que contém o array de bytes) e um segundo parâmetro,
        * que é a codificação utilizada (necessária para decodificar o texto).
        * Para facilitar e seguir um padrão de projeto (chamado Decorator) podemos utilizar as chamadas encadeadas conforme a seguir:
        *
        * usamos o BufferedReader para ler o texto passando a InputStreamReader que recebe o array de bytes + a codificação do texto, dentro do try-with-resources
        * */

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new ByteArrayInputStream(BYTES)
                        , StandardCharsets.UTF_8
                )
        )){
            System.out.println(reader.readLine()); // para ler uma linha completa
        }
    }
}
