package file;

import java.nio.file.Path;

@SuppressWarnings("ALL")
public class PathApp2 {

    public static void main(String[] args) {
        Path p1 = Path.of("home"); // representa, como exemplo, o primeiro nível do diretório
        Path p2 = Path.of("samu"); // representa, como exemplo, uma outra parte do diretório
        Path p3 = Path.of("log.out"); // representa, como exemplo, um arquivo de log qualquer

        // para montar um caminho com essas partes podemos usar um método do Path chamado resolve
        Path p4 = p1.resolve(p2).resolve(p3); // vai resultar num novo Path( o p4) porque as instancias dele são imutáveis
        System.out.println(p4);

        // outra opção é o toAbsolutePath que retorna uma caminho absoluto (completo a partir do que é considerado a raiz). Porque as vezes o caminho relativo não é suficiente
        Path p5 = p4.toAbsolutePath();
        System.out.println(p5);



    }
}
