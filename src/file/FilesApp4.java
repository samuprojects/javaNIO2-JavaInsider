package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesApp4 {

    public static void main(String[] args) throws IOException {

        //Path file = Path.of("myfile.txt"); // criação de arquivo na raiz do projeto
        //Files.createFile(file); // chamada de método para criação do arquivo

        // para apagar o arquivo gerado pelas linhas acima

        //Files.delete(file); // chama o método delete passando a variável do arquivo criado
        // se chamar o método novamente após a exclusão do arquivo terá o erro "Exception in thread "main" java.nio.file.NoSuchFileException"
        // ou seja primeiro precisa verificar se ele existe implementando uma validação ou usando o método a seguir

        //Files.deleteIfExists(file); // faz a checagem automaticamente

        // Obs.: não vale para diretórios com arquivos, somente vazios do contrário vai gerar Exception in thread "main" java.nio.file.DirectoryNotEmptyException

        Path file1 = Path.of("src/examples");
        Files.deleteIfExists(file1);
    }
}
