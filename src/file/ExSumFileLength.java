package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ExSumFileLength {

    public static void main(String[] args) throws IOException {

        Path initialDir = Path.of("");
        System.out.println(initialDir.toAbsolutePath());

        System.out.println(calculateSize(initialDir));

    }

    private static long calculateSize(Path initiaDir) throws IOException { // método para calcular tamanho (em bytes) dos arquivos de um diretório

        long totalSize = 0;
        try (var files = Files.newDirectoryStream(initiaDir)) {
            for (Path file : files) {
                if (Files.isDirectory(file)) { // aplica a recursividade para entrar em outros diretórios caso exista
                    totalSize += calculateSize(file);
                } else { // se remover o teste da condição e deixar apenas a linha abaixo vai apenas somar os arquivos da raiz
                    totalSize += Files.size(file); // size retorna um long com o tamanho de todos os arquivos onde incrementamos a cada iteração o valor na variável totalSize
                }
            }

            return totalSize;
        }

    }
}