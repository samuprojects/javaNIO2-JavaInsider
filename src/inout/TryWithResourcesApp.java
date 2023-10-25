package inout;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@SuppressWarnings("ALL")
public class TryWithResourcesApp {

    public static void main(String[] args) {

        // toda vez que trabalhamos com IO estamos lidando com canais de entrada ou saída e esses devem ser fechados ao final da utilização para não "prender" recursos do sistema operacional
        // o padrão é chamar o close() para encerrar esses canais.
        // PORÉM, podem ocorrer exceções no caminho e o canal que foi aberto não será fechado
        // na forma clássica de resolução:
        // existe o bloco finally que usado em conjunto com o try pode executar o close() independente se houve exceção ou não.
        // porém para utilizá-lo deveria primeiro inicializar fora do bloco o canal de saída com null, fazer uma checagem no final para verificar se está null e não estando executar o close()
        // isso sem contar o bloco catch caso for tratar alguma exceção, e ainda usar um try dentro de outro try apenas para tratar a exceção que pode ser lançada pelo close()

//        FileWriter out = null;
//        try {
//            try {
//                out = new FileWriter("out.txt", StandardCharsets.UTF_8);
//                out.write("Something");
//            } finally {
//                if (out != null) {
//                    out.close();
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // para isso foi criado o try-with-resources que ao informar num parametro o que você precisa, podendo após o bloco inclusive usar o catch, faz o fechamento automatico do canal o close()

        try (FileWriter out = new FileWriter("out.txt", StandardCharsets.UTF_8)){
            out.write("Something");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // isso ocorre porque, em algum nível, todas as variáveis que podem ser informadas no try-with-resources implementam a interface AutoCloseable
        // essa interface foi criada para utilização com o try-with-resources. Ela possui apenas um método close que lança uma Exception.
        // Vale lembrar que também existe outra interface por nome Closeable (que é de IO) que estende AutoCloseable porém com um método que lança uma IOException
        // portanto todas os elementos que trabalham com canais em IO implementam a interface Closeable, todos possuem close() e por isso todos são Autocloseable podendo ser utilizados com o try-with-resources
        // a vantagem é que é chamado mesmo na presença de exceção, além da simplificação do código (eliminando código extra (Boilerplate code) de gerenciamento do fluxo de execução), focando na implementação da funcionalidade
    }
}
