package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@SuppressWarnings("ALL")
public class FilesApp3 {

    public static void main(String[] args) throws IOException {

        //Path tempDir = Files.createTempDirectory("app_"); // cria pasta temporária nas configurações do usuário
        //Path tempDir = Files.createTempDirectory(Path.of(""), "app_"); // cria pasta temporária na raiz do projeto
        //System.out.println(tempDir);

        //Path tempFile = Files.createTempFile("app_", null); // cria arquivo na pasta do usuário com extensão tmp
        //Path tempFile = Files.createTempFile("app_", ".temp"); // pode arquivo na pasta do usuário com outra extensão que especificar
        Path tempFile = Files.createTempFile(Path.of(""), "app_", null); // pode criar arquivo na raiz do projeto com extensão tmp ou outra se especificar
        System.out.println(tempFile);
    }
}
