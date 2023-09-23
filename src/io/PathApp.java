package io;

import java.nio.file.Path;

@SuppressWarnings("ALL")
public class PathApp {

    public static void main(String[] args) {

        // Path é uma interface que representa um caminho no sistema de arquivos
        // podemos chamar o mais comum que é o Path.of que recebe os pedaços desse caminho
        // no modelo windows a barra é invertida -> C:\System\Java\file.exe
        // no linux a barra é normal
        Path p1 = Path.of("/home", "teste", "file.exe");
        System.out.println(p1); // vai apresentar o caminho informado, o separador não precisa se preocupar e focar nos pedaços

        // se quiser extrair esse arquivo
        Path p2 = p1.getFileName();
        System.out.println(p2);

        // podemos chamar getRoot que retorna um Path com a origem do caminho (C:\ no windows ou / no linux)
        Path p3 = p1.getRoot();
        System.out.println(p3);
    }
}
