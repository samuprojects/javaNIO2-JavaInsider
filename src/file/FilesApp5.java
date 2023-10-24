package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FilesApp5 {

    public static void main(String[] args) throws IOException {

        //copiando arquivos
        Path from = Path.of("src/examples", "file1.txt"); // representa origem
        //Path to = from.getParent().resolve("file2.txt"); // from.getParent para usar o mesmo diretório do arquivo onde será criado a cópia / representa o destinO

        // pode copiar o mesmo arquivo em outro diretório como a seguir
        //Path to = from.getParent().resolve(Path.of("files", "file1.txt"));

        //Files.copy(from, to); // chama o método copy passando origem, destino / como lança exceção optou por throws no main

        // se rodar o comando com arquivo já criado lançará exceção Exception in thread "main" java.nio.file.FileAlreadyExistsException
        // para resolver isso pode usar um terceiro argumento utilizando o enum REPLACE_EXISTING conforme a seguir
        Path to = from.getParent().resolve(Path.of("files", "file1.txt"));
        Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);

        // para mover arquivos mesmo esquema do copy, passa os dois paths e o terceiro argumento caso queira substituir um existente.
        Files.move(from, to, StandardCopyOption.REPLACE_EXISTING);

    }
}
