package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ExFileCreate {

    public static void main(String[] args) throws IOException {

        // Essa aplicação gera um novo arquivo em um diretório especificado com o padrão de nome prefixo "file_" seguido de:
        // data/hora atual do sistema, seguido da extensão ".txt"

        Path dir = Path.of("src/examples"); // definindo a pasta padrão como a raiz do projeto
        String fileName = "file_" + System.currentTimeMillis() + ".txt"; // seguindo padrão enunciado (currentTimeMillis de System traz a data/hora atual do sistema)
        Files.createFile(dir.resolve(fileName)); // dir.resolve sinaliza para criar no diretório especificado e o parametro é o arquivo em questão

    }
}
