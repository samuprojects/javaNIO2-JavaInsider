package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesApp6 {

    public static void main(String[] args) throws IOException {

        // Solicitar acesso a todos os arquivos e diretórios que fazem parte de um determinado caminho e iterar sobre eles
        // se quiser todos os arquivos do diretório atual usar Path.of com parametro vazio "", não exquecer de lançar a exception para o main nesse momento
        //Files.newDirectoryStream(Path.of("")); // o retorno dessa stream é um tipo de path que pode ser parametrizado e como essa stream necessita ser fechada
        // chamar o método close() ou utilizar um try-with-resources para garantir o fechamento mesmo na presença de exceções conforme a seguir:

        try (var files = Files.newDirectoryStream(Path.of(""), "*md")) {
            for (Path path : files) { // depois iteramos sobre cada um e mostramos na tela
                //System.out.println(path);

                // se quiser identificar o que é diretório (true) e o que é arquivo (false) pode utilizar
                System.out.println(path + " - " + Files.isDirectory(path));
            }
        }

        // outro ponto é que pode especificar o retorno do newDirectoryStream passando o glob como argumento e definindo por exemplo *.md que vai trazer apenas o README
        // se deixar sem o glob vai trazer tudo, assim como se usar apenas o asterisco * como argumento do glob
        // ou pode deixar com .* que vai trazer por exemplo .git, etc
        // na documentação tem todos os tipos de filtro que o glob pode oferecer
    }
}
