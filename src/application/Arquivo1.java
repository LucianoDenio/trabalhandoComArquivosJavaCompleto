package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Arquivo1 {

    public static void main(String[] args) {

        // Criando um objeto File com o caminho do arquivo a ser lido.
        // O caminho "C:\\Temp\\cachorro\\dino\\maça.txt" indica a localização do arquivo no sistema.
        // Essa classe representa um arquivo ou diretório no sistema.
        File file = new File("C:\\Temp\\cachorro\\dino\\maça.txt");

        // Declarando o Scanner com valor null inicialmente.
        // O Scanner será usado mais tarde para ler o conteúdo do arquivo.
        Scanner sc = null;

        // Bloco try para tentar executar a leitura do arquivo.
        try {
            // Inicializando o Scanner para ler o arquivo especificado.
            sc = new Scanner(file);

            // Usando um loop para verificar e ler linha por linha do arquivo.
            while (sc.hasNextLine()) {
                // Exibindo no console cada linha encontrada no arquivo.
                System.out.println(sc.nextLine());
            }
        } 
        // Bloco catch para capturar e tratar erros relacionados à manipulação do arquivo.
        // Por exemplo, erros como "arquivo não encontrado" ou problemas de permissão.
        catch (IOException e) {
            // Exibindo no console uma mensagem de erro, caso ocorra.
            System.out.println("Erro: " + e.getMessage());
        } 
        // Bloco finally, que será executado independentemente de sucesso ou erro.
        // É usado para fechar recursos como o Scanner, garantindo que não haja vazamentos de memória.
        finally {
            if (sc != null) {
                // Fechando o Scanner, liberando o recurso.
                sc.close();
            }
        }
    }
}
