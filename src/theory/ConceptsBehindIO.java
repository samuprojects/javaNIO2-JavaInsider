package theory;

@SuppressWarnings("ALL")
public class ConceptsBehindIO {

    /*
    * Até o momento foi trabalhado diversas operações em arquivos
    * Agora uma outra parte é trabalhar diretamente com a IO para entrada e saída de dados
    *
    * Recapitulando
    *
    * Dados podem entrar na aplicação vindo de algum lugar (INPUT)
    * Também podemos ter nossa aplicação enviando dados para algum lugar (OUTPUT)
    *
    *          INPUT      _____    OUTPUT
    *    ?     ------->    |APP|    ------>   ?
    *    ?     ------->    |___|    ------>   ?
    * O Java possui diversas classes que lidam com Input e Output, em dados binários ou em forma de texto.
    *
    * Dica: entendendo a lógica de cada uma delas fica fácil utiliza-las, os nomes delas, por exemplo, dão uma ideia do seu objetivo
    *
    * SOBRE INPUT (entrada de dados)
    * Toda vez que trabalhamos com classes no Java que tratam de input teremos no seu nome:
    * alguma coisa + sufixo (ou seja, que terminam com um dos nomes abaixo se trata de input)
    * _____________+ Reader (trafegam caracteres) (os bytes são abstraídos e tratados como caracteres)
    * _____________+ InputStream (trafegam bytes) (aqui é o dado como ele é) (pode trabalhar com arquivos binários, imagens, som, vídeo, etc)
    *
    *
    * SOBRE OUTPUT (saída de dados)
    * Toda vez que trabalhamos com classes que tratam de output teremos no seu nome:
    * alguma coisa + sufixo (ou seja, que terminam com um dos nomes abaixo se trata de output)
    * -------------+ Writer (trafegam caracteres) (os bytes são abstraídos e tratados como caracteres)
    * -------------+ OutputStream (trafegam bytes) (aqui é o dado como ele é) (pode trabalhar com arquivos binários, imagens, som, vídeo, etc)
    * */
}
