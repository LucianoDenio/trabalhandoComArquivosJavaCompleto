package application;

import java.io.File;
import java.util.Scanner;

public class Arquivo4 {

    public static void main(String[] args) {

        /*
         * Este programa permite ao usuário listar os diretórios (pastas) e arquivos
         * presentes em um caminho de pasta especificado.
         *
         * 1. O programa utiliza a classe Scanner para receber o caminho de uma pasta como entrada.
         * 2. Cria um objeto File representando o caminho fornecido.
         * 3. Usa o método listFiles() do objeto File para obter:
         *      - Apenas diretórios, com a ajuda de File::isDirectory.
         *      - Apenas arquivos, com a ajuda de File::isFile.
         * 4. Exibe os nomes dos diretórios e arquivos no console em seções separadas.
         * 5. O programa é útil para explorar rapidamente o conteúdo de uma pasta.
         *
         * Observação: 
         * - Caso o caminho fornecido pelo usuário não exista ou não seja uma pasta válida, o programa pode não funcionar corretamente.
         * - Nenhum tratamento de erro foi implementado para caminhos inválidos.
         */

        // Criação de um Scanner para ler o caminho de pasta informado pelo usuário
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário que insira o caminho da pasta
        System.out.print("Enter a folder path: ");
        String strPath = sc.nextLine(); // Lê o caminho digitado pelo usuário

        // Criação de um objeto File para representar o caminho fornecido
        File path = new File(strPath);

        // Obtém todos os diretórios dentro do caminho fornecido
        File[] folders = path.listFiles(File::isDirectory);

        // Exibe a lista de diretórios encontrados
        System.out.println();
        System.out.println("FOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder); // Exibe cada diretório
        }

        // Obtém todos os arquivos dentro do caminho fornecido
        System.out.println();
        System.out.println("FILES: ");
        File[] files = path.listFiles(File::isFile);
        for (File f : files) {
            System.out.println(f); // Exibe cada arquivo
        }

        // Fecha o Scanner para liberar o recurso
        sc.close();
    }
}
