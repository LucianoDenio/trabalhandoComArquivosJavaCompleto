package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo3 {

    public static void main(String[] args) {

        /*
         * Este programa escreve múltiplas linhas de texto em um arquivo.
         * Ele utiliza as classes BufferedWriter e FileWriter para gravar as linhas de texto.
         *
         * 1. Criamos um array de Strings chamado "lines", que contém as linhas de texto que queremos gravar.
         * 2. Definimos o caminho do arquivo onde as informações serão gravadas, na variável "path".
         * 3. Abrimos um bloco try-with-resources:
         *      - O BufferedWriter é inicializado com um FileWriter, que recebe o caminho do arquivo.
         *      - Utilizamos um laço for para percorrer o array de linhas e gravar cada uma no arquivo.
         *      - Após cada linha, chamamos bw.newLine() para pular para a próxima linha no arquivo.
         * 4. Caso ocorra um erro durante o processo, o bloco catch captura a exceção IOException e podemos tratá-la.
         * 5. Como utilizamos try-with-resources, o BufferedWriter será fechado automaticamente ao final do bloco try.
         *
         * Observação: Se o arquivo já existir, ele será sobrescrito. Se não existir, será criado automaticamente.
         */

        // Array de Strings com as linhas que serão gravadas no arquivo
        String[] lines = new String[] { "Vamos aprender", "É massa demais", "lecigo" };

        // Caminho do arquivo onde as informações serão gravadas
        String path = "C:\\Temp\\cachorro\\dino\\secret.txt";

        // Bloco try-with-resources para garantir o fechamento automático do BufferedWriter
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            // Percorre cada linha do array e grava no arquivo
            for (String line : lines) {
                bw.write(line); // Escreve a linha no arquivo
                bw.newLine();   // Adiciona uma quebra de linha
            }
        } 
        // Captura possíveis erros ao trabalhar com o arquivo
        catch (IOException e) {
            e.printStackTrace(); // Imprime o rastreamento da pilha para análise do erro
        }
    }
}
