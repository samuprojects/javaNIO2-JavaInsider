package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@SuppressWarnings("ALL")
public class FilesApp2 {

    public static void main(String[] args) throws IOException {

        // Para criar diretorios podemos pegar como exemplo o package examples e criar um diretorio dentro usando o Path para direcionar a raiz

        // Path root = Path.of("src/examples"); // como é relativo aqui vai pegar como base o diretorio do projeto e vai achar o examples

        // podemos usar um método da classe Files para criar esse outro diretório
        // Files.createDirectory(root.resolve("d1")); // o root.resolve vai criar o Path d1. O método createDirectory pode lançar exceção, não vamos tratar nesse momento lançando pra fora do main

        // se tudo ocorrer como esperado o diretorio d1 será criado dentro de examples

        // se descomentar e rodar novamente o código dará erro pois o diretório já existe por isso vamos melhorar isso com uma checagem

        Path root = Path.of("src/examples");

        Path d1 = root.resolve("d1");
        if (!Files.exists(d1)){
            Files.createDirectory(d1);
        }

        // usando outra forma para criar d2 e d3 podemos utilizar

        Path d3 = Files.createDirectories(d1.resolve(Path.of("d2","d3")));
        System.out.println(d3);

        // a vantagemn do método acima é que além de já definir vários diretórios se já existe ele não cria poupando a ciração de uma lógica para checagem

        // para criar arquivos dentro desses diretórios podemos usar
        Files.createFile(d3.resolve("d3.txt"));

        // podemos criar d2.txt voltando um diretório em d3 utilizando
        Files.createFile(d3.getParent().resolve("d2.txt")); // apagar d3.txt antes de testar porque já existe senão dará erro

        Files.createFile(d3.getParent().getParent().resolve("d1.txt"));
    }
}
