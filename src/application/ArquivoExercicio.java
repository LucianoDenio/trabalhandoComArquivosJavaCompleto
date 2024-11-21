package application;

/*
 * ESTE PROGRAMA TEM COMO OBJETIVO:
 * 
 * 1. Ler um arquivo de texto contendo informações de produtos.
 *    - O formato esperado para cada linha é: "NomeProduto, PreçoUnitário, Quantidade".
 *    - Exemplo de linha: "Tv, 1200.00, 2".
 * 
 * 2. Processar os dados de cada produto.
 *    - Calcular o valor total (PreçoUnitário * Quantidade) para cada produto.
 *    - Formatar os dados como: "NomeProduto, ValorTotal".
 *    - Exemplo de saída: "Tv, 2400.00".
 * 
 * 3. Gravar os resultados processados em um novo arquivo.
 *    - O novo arquivo será criado em um subdiretório chamado "produtosUpdate".
 *    - Cada linha do arquivo conterá o formato processado: "NomeProduto, ValorTotal".
 * 
 * COMO FUNCIONA:
 * 
 * - Caminho do Arquivo:
 *   O programa define o caminho do arquivo de entrada e do diretório de saída.
 * 
 * - Leitura:
 *   Utiliza `BufferedReader` para ler o arquivo linha por linha.
 *   Divide cada linha em partes para extrair Nome, Preço e Quantidade.
 *   Calcula o valor total para o produto e o armazena em um array.
 * 
 * - Escrita:
 *   Utiliza `BufferedWriter` para criar e gravar o arquivo processado.
 *   Cada produto processado é salvo no formato correto em uma nova linha.
 * 
 * - Tratamento de Exceções:
 *   Os blocos `try-catch` garantem que erros de leitura e escrita sejam tratados.
 * 
 * OBSERVAÇÕES:
 * - Certifique-se de que o arquivo de entrada existe no caminho especificado.
 * - O programa é limitado a armazenar no máximo 10 produtos no array (ajustável).
 * - Se o diretório de saída já existir, ele será reutilizado.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoExercicio {

    public static void main(String[] args) {

        // Caminho para o arquivo de entrada com os dados dos produtos
        String archive = "C:\\Temp\\atividadeArquivos\\produtos.txt";

        // Caminho do diretório onde o arquivo de saída será salvo
        String path = "C:\\Temp\\atividadeArquivos";

        // Array para armazenar os produtos processados
        String[] products = new String[10];
        int position = 0; // Índice para controlar a posição no array

        // Criação do diretório "produtosUpdate" para armazenar o arquivo de saída
        File outputDir = new File(path + "\\produtosUpdate");
        boolean success = outputDir.mkdir();
        if (!success && !outputDir.exists()) {
            System.out.println("Erro ao criar o diretório de saída.");
            return; // Encerra o programa se o diretório não foi criado
        }

        // Bloco try-with-resources para leitura do arquivo de entrada
        try (BufferedReader br = new BufferedReader(new FileReader(archive))) {
            String line = br.readLine(); // Lê a primeira linha do arquivo

            while (line != null) { // Continua enquanto houver linhas no arquivo

                // Verifica se o array está cheio para evitar erros
                if (position >= products.length) {
                    System.out.println("Aviso: Número de produtos excede o tamanho do array.");
                    break; // Sai do loop se o array estiver cheio
                }

                // Divide a linha em partes separadas por vírgulas
                String[] parts = line.split(",");
                String name = parts[0].trim(); // Extrai o nome do produto
                double price = Double.parseDouble(parts[1].trim()); // Converte o preço para double
                int quantity = Integer.parseInt(parts[2].trim()); // Converte a quantidade para int

                // Calcula o valor total para o produto
                double total = price * quantity;

                // Monta a string formatada "NomeProduto, ValorTotal" e a adiciona ao array
                products[position] = name + ", " + String.format("%.2f", total);
                System.out.println("Processado: " + products[position]); // Exibe no console
                line = br.readLine(); // Lê a próxima linha do arquivo
                position++; // Incrementa a posição no array
            }

        } catch (IOException e) {
            // Trata erros de leitura do arquivo
            e.printStackTrace();
        }

        // Bloco try-with-resources para escrita no arquivo de saída
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputDir + "\\produtos2.txt"))) {
            for (String result : products) {
                // Verifica se a string não é nula antes de gravá-la no arquivo
                if (result != null) {
                    bw.write(result); // Escreve a string no arquivo
                    bw.newLine(); // Adiciona uma quebra de linha
                }
            }
            System.out.println("Arquivo atualizado criado com sucesso!");

        } catch (IOException e) {
            // Trata erros de escrita no arquivo
            e.printStackTrace();
        }
    }
}
