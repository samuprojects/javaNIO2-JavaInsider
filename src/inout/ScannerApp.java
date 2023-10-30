package inout;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class ScannerApp {

    public static void main(String[] args) throws IOException {

        // conforme visto anteriormente um forma simplificada de escrita era utilizando PrintWriter
        // para leitura podemos utilizar a classe Scanner, que faz parte do pacote java.util, pode receber Streams de qualquer tipo, ou File, ou Path que são representação
        // de arquivos, ou uma String diretamente, ou um Readable (que é a interface que todos os Reader implementam como o FileReader, InputStreamReader, etc)
        // nesse exemplo faremos a leitura de um arquivo de exemplo qualquer usando o Path

        try (Scanner scanner = new Scanner(Path.of("examples").resolve("in.txt"))){
            scanner.useDelimiter("\\|"); // podemos usar o método useDelimiter para indicar um separador, por exemplo
//            while (scanner.hasNextLine()) { // método nextLine vai para a próxima linha, porém com o hasNextLine, faz uma verificação pra saber se ela existe o que permite usar o loop para ler sem parar enquanto existir
//                String line = scanner.nextLine(); // para ler a linha e ir a pŕoxima
//                System.out.println(line);
//            }

            while ((scanner.hasNext())){ // hasNext vai levar em conta não a linha mas o padrão definido no delimitador
                String line = scanner.next(); // para retornar o próxima elemento
                System.out.println(line);
            }
            // por essa facilidade em ler já fazendo as quebras ou tokens é uma classe muito utilizada para leitura
        }
    }
}
