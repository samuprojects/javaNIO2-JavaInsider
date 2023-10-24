package file;

import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;

public class FileApp {

    public static void main(String[] args) {

        /*Até o momento utilizando o Path para trabalhar com caminhos de arquivos é importante lembrar que surgiu na API NIO
        * antes existia uma outra classe chamada File do pacote java.io que apesar de não utilizada diretamente na NIO
        * aparece em alguns outros cenários que são complementados com a NIO API e (por ser legada) está presente em muitos sistemas pelo mercado
        *
        * */

        // aqui definimos o nome do diretório apenas como "ponto"
        File file = new File("."); // o construtor de File pode receber mais 2 parametros: o parent (definindo onde o arquivo está) e o child (o nome do arquivo)

        // File possui vários métodos, exemplos:
        System.out.println(file.isFile()); // retorna se é um arquivo (true)
        System.out.println(file.exists()); // retorna se o arquivo ou diretório existe
        System.out.println(file.getName()); // retorna nome do arquivo ou diretório
        System.out.println(file.getAbsoluteFile()); // retorna uma instancia de File que representa esse caminho absoluto
        System.out.println(file.getAbsolutePath()); // retorna uma String desse caminho absoluto que o ponto está referenciando

        /*
        * Ou seja, muitos métodos estáticos na classe File da NIO API podem ser acessados diretamente dentro do objeto File
        * */

        // Outro exemplo, se quiser listar arquivos de um diretório pode usar

        System.out.println(Arrays.toString(file.list())); // retorna um array de String
        System.out.println(Arrays.toString(file.listFiles()));  // retorna um array de File

        // como ainda existem sistemas utilizando o File foi projetado no Java uma forma de converter isso para Path
        Path path = file.toPath(); // converte o File para Path
        System.out.println(path.toAbsolutePath());

        // é possível fazer o inverso
        File file2 = path.toFile(); // converte Path para File
        System.out.println(file2.getAbsolutePath());


    }
}
