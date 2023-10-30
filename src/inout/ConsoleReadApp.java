package inout;

import java.io.IOException;
import java.util.Scanner;

public class ConsoleReadApp {

    public static void main(String[] args) throws IOException {

        // Para realizar a leitura de dados a partir do console, exemplo: o usuário digitar alguma coisa, o app ler e seguir com alguma execução
        // lembrando que o console também é uma operação de IO que pode ser tanto input quanto output conforme exemplos passados

        // segue leitura sem scanner

//        try (var reader = new BufferedReader(new InputStreamReader(System.in))){ // lendo do console no canal System.in
//            String line = reader.readLine();
//            System.out.println(new StringBuilder(line).reverse()); // reverse inverte a palavra digitada pelo usuário
//        }

        //usando scanner
        try (var scanner = new Scanner(System.in)){
            String line = scanner.nextLine();
            System.out.println(new StringBuilder(line).reverse());
        }

        //System.in.read(); // após fechar o canal no código acima se chamar nova leitura dará exceção

        // a mesma coisa ocorre para o System.out.println, se fechar o canal não vai imprimir nada e nesse caso não dará erro porque conforme documentação
        // não há impressão do erro, ficar atento com esse cenário para não ter problemas
        // lembrando que é importante fechar o canal, mas requer essa atenção dependendo do cenário

        System.out.close(); // fechou o canal de saída, tudo que for solicitado em println será ignorado
        System.out.println("Java");
    }
}
