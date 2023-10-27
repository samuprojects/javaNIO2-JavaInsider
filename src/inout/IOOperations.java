package inout;

import java.io.*;

@SuppressWarnings("ALL")
public class IOOperations { // classe utilizada para abstrair os códigos de leitura e escrita das aulas anteriores permitindo utilização mais genérica por outras classes

    public static void write(Writer out, String text) throws IOException {
        out.write(text);
    }

    public static String read(Reader in) throws IOException{
        StringBuilder text = new StringBuilder();

        int c = in.read();
        while ( c > -1) {
            text.append((char) c);
            c = in.read();
        }

        return text.toString();
    }

    public static String read(BufferedReader in) throws IOException { // sobrecarga do método vai garantir um design pattern Decorator na aplicação
        String line;
        StringBuilder text = new StringBuilder();
        while ((line = in.readLine()) != null){
            text.append(line).append("\n");
        }

        return text.toString();
    }

    // Input e Output Stream trabalham com bytes por isso a sobrecarga dos métodos  read (recebe array) e write (escreve num array)
    public static byte[] read(InputStream in) throws IOException{
        return in.readAllBytes();
    }

    public static void write(OutputStream out, byte[] bytes) throws IOException {
        out.write(bytes);
    }

    // acrescentando método para realizar transferencia de arquivos seja qual for (download da web, transferencia para outro pc, etc)
    // a grande vantagem do uso de Stream é o de seguir lendo, e escrevendo, o que foi lido sem precisar carregar tudo na memória
    // por isso requer atenção na forma de uso como é o caso do read() que utiliza um readAllBytes() mais acima que num arquivo de 1TB faria a leitura toda para a RAM
    public static void tranfer(InputStream in, OutputStream out) throws IOException {
        byte[] buffer = new byte[2048]; // buffer = area temporária de memória para receber os bytes lidos nesse array de bytes, e transferir para a saída, podendo receber mais informações

        while (true) { // tecnicamente infinito, porém, colocamos a condição para encerrar quando todos os dados forem lidos
            int bytesRead = in.read(buffer); // para armazenar os dados lidos colocamos no buffer // a partir de 0 até o tamanho de dados que queremos gravar (usando o length)

            if (bytesRead < 0) {
                break;
            }
            out.write(buffer, 0, bytesRead); // na saída informar para ler do buffer (de 0) até o que foi lido em bytesRead (colocar em loop senão vai ler apenas 2048 e desprezar o resto)

        }

    } // esse transfer possui um código bem otimizado que quase não ocupa memória da aplicação e permite transferir grandes quantidades de dados, dependendo do cenário vale buscar um buffer ideal para a regra de negócio estabelecida
}
