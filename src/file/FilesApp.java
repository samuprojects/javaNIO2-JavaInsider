package file;

import java.nio.file.Files;
import java.nio.file.Path;

@SuppressWarnings("ALL")
public class FilesApp {

    public static void main(String[] args) {

        Path file1 = Path.of("examples/file1.txt");
        System.out.println(Files.exists(file1)); // vai mostrar com base no caminho relativo no diretorio atual do projeto
        System.out.println(file1.toAbsolutePath()); // vai mostrar o caminho absoluto

        // o método isDirectory() indica se um caminho representa um diretório ou não
        System.out.println(Files.isDirectory(file1)); // verifica se é um diretorio = false pois é o nome do arquivo
        System.out.println(Files.isRegularFile(file1)); // verifica se é um arquivo = true nesse exemplo
        //Files.isSameFile()// verifica se dois Paths representam o mesmo arquivo no sistema operacional (sistema de arquivos)

        // outros métodos interessantes isWritable para verificar se o arquivo tem permissão de escrita
        // isReadable verifica se pode ser lido
        // isHidden se é oculto ou não
        // isExecutable para saber se é executável ou não
        // isSumbolicLink para verificar se são atalhos ou não
    }
}
