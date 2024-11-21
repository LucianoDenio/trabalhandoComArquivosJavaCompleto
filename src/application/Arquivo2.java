package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Arquivo2 {

    public static void main(String[] args) {

        /*
         * Explicação do funcionamento:
         * 
         * 1. Caminho do arquivo (`path`):
         *    - Define o local do arquivo que será lido. Você pode substituir esse caminho para apontar para outro arquivo.
         * 
         * 2. `BufferedReader` e `FileReader`:
         *    - `FileReader`: Abre o arquivo para leitura.
         *    - `BufferedReader`: Envolve o `FileReader` para fornecer uma leitura mais eficiente e permite ler o arquivo linha por linha.
         * 
         * 3. Bloco try-with-resources:
         *    - Garante que o recurso (no caso, `BufferedReader`) seja fechado automaticamente, eliminando a necessidade de usar um bloco `finally`.
         * 
         * 4. Loop para leitura:
         *    - O método `readLine()` lê o conteúdo do arquivo linha por linha até atingir o final (quando retorna `null`).
         * 
         * 5. Tratamento de exceções (`catch`):
         *    - Captura e exibe mensagens de erro relacionadas à leitura ou ao acesso do arquivo.
         */

        // A variável "path" armazena o caminho do arquivo que será lido.
        // Esse caminho deve apontar para um arquivo válido no sistema.
        String path = "C:\\Temp\\cachorro\\dino\\maça.txt";

        // Bloco try-with-resources para gerenciar automaticamente o recurso "BufferedReader".
        // Isso significa que o "BufferedReader" será fechado automaticamente ao final do bloco,
        // mesmo que ocorra uma exceção.
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            // A variável "line" armazena temporariamente cada linha lida do arquivo.
            String line = br.readLine();

            // Enquanto a linha lida não for "null" (ou seja, enquanto houver linhas no arquivo),
            // o loop continuará lendo e exibindo cada linha no console.
            while (line != null) {
                System.out.println(line); // Imprime a linha atual no console.
                line = br.readLine(); // Lê a próxima linha do arquivo.
            }
        } 
        // Bloco catch para tratar possíveis erros que podem ocorrer ao manipular o arquivo.
        // A classe IOException captura problemas como "arquivo não encontrado" ou "erro de leitura".
        catch (IOException e) {
            // Exibe uma mensagem de erro no console, informando o motivo do problema.
            System.out.println("Error: " + e.getMessage());
        }
    }
}
