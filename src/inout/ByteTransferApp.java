package inout;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ByteTransferApp {

    public static void main(String[] args) throws IOException {

        // simulando a transferencia de arquivos, podemos usar uma InputStream para pegar uma string e passar para um arquivo (usando um getBytes que retorna um array de bytes)

        try (
                //InputStream in = new ByteArrayInputStream("Java = sensacional!".getBytes(StandardCharsets.UTF_8)); // transforma string num array de bytes
                //OutputStream out = new FileOutputStream("src/examples/text") // saída do que foi lido acima

                // agora vamos ler um File para uma saída String
                InputStream in = new FileInputStream("src/examples/file2.txt");
                ByteArrayOutputStream out = new ByteArrayOutputStream() // transfere para um array de bytes e permite ter acesso a um outro método na impressão

        ) {
            IOOperations.tranfer(in, out); // utiliza o método com buffer da aula anterior para transferir o conteúdo

            String str = out.toString(StandardCharsets.UTF_8); // converte para string na codificação indicada
            System.out.println(str); // exibe o conteúdo do arquivo file2.txt na tela
        }
    }
    /* Com esse tipo de operação usando o transfer e, usando o poder do polimorfismo do Java (que nos permite ter comportamentos diferentes
     de acordos com objetos que estão na memória, em momentos diferentes onde a chamada é feita), obtemos um método de transferência
     que realiza esse processo de qualquer lugar para outro, colocando os dados de entrada dentro do InputStream e os de saída no OutputStream*/
}
