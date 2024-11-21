# 📁 Projeto: Manipulação de Arquivos em Java

Este repositório contém exemplos práticos e bem comentados de como manipular arquivos em Java. Cada arquivo demonstra uma funcionalidade específica, desde leitura e escrita de arquivos até manipulações mais avançadas, como cálculo de valores e organização de diretórios.

---

## 📜 Estrutura do Repositório

### **1. [Arquivo1.java](./src/application/Arquivo1.java)**
- **Descrição**: Demonstra como usar a classe `Scanner` para ler o conteúdo de um arquivo de texto.
- **Funcionalidades**:
  - Leitura de um arquivo linha por linha.
  - Tratamento de exceções para garantir a segurança da aplicação.
- **Caminho de exemplo utilizado**: `C:\\Temp\\cachorro\\dino\\maça.txt`.

---

### **2. [Arquivo2.java](./src/application/Arquivo2.java)**
- **Descrição**: Exemplo de uso das classes `BufferedReader` e `FileReader` para ler arquivos com maior eficiência.
- **Funcionalidades**:
  - Leitura de um arquivo linha por linha.
  - Uso do bloco `try-with-resources` para garantir o fechamento automático dos recursos.
- **Caminho de exemplo utilizado**: `C:\\Temp\\cachorro\\dino\\maça.txt`.

---

### **3. [Arquivo3.java](./src/application/Arquivo3.java)**
- **Descrição**: Mostra como escrever em arquivos usando as classes `BufferedWriter` e `FileWriter`.
- **Funcionalidades**:
  - Gravação de um array de strings em um arquivo de texto.
  - Uso do método `newLine()` para adicionar quebras de linha no arquivo.
- **Caminho de exemplo utilizado**: `C:\\Temp\\cachorro\\dino\\secret.txt`.

---

### **4. [Arquivo4.java](./src/application/Arquivo4.java)**
- **Descrição**: Demonstra como listar arquivos e pastas dentro de um diretório.
- **Funcionalidades**:
  - Identificação e listagem de arquivos e subdiretórios.
  - Uso da classe `File` e métodos como `listFiles()`.
- **Entrada do usuário**: Caminho do diretório a ser listado.

---

### **5. [ArquivoExercicio.java](./src/application/ArquivoExercicio.java)**
- **Descrição**: Exercício prático de leitura, processamento e escrita de arquivos.
- **Funcionalidades**:
  - Leitura de um arquivo contendo informações de produtos no formato: `NomeProduto, PreçoUnitário, Quantidade`.
  - Cálculo do valor total de cada produto (PreçoUnitário × Quantidade).
  - Escrita do resultado processado em um novo arquivo.
- **Caminhos utilizados**:
  - Arquivo de entrada: `C:\\Temp\\atividadeArquivos\\produtos.txt`.
  - Arquivo de saída: `C:\\Temp\\atividadeArquivos\\produtosUpdate\\produtos2.txt`.

---

## 🚀 Tecnologias Utilizadas

- **Java 17**: Linguagem de programação utilizada no projeto.
- **IDE**: Eclipse ou IntelliJ (compatível com ambas).
- **Classes principais**:
  - `Scanner` para leitura de arquivos.
  - `BufferedReader` e `FileReader` para leitura eficiente.
  - `BufferedWriter` e `FileWriter` para escrita eficiente.
  - `File` para manipulação de diretórios e arquivos.

---

## 🛠️ Como Executar os Exemplos

1. Clone este repositório para sua máquina local:
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git


2. Certifique-se de ajustar os caminhos de arquivo no código para o ambiente da sua máquina.

3. Compile e execute os arquivos Java individualmente utilizando sua IDE de preferência ou o terminal:
```bash
javac NomeDoArquivo.java
java NomeDoArquivo
```
___

## 📚 O que você aprenderá
Manipulação básica e avançada de arquivos em Java.
Boas práticas no uso de blocos try-with-resources.
Tratamento de exceções para manipulação segura de arquivos.
Estruturação de programas que lidam com entrada e saída de dados.
___

## 💡 Sugestões para Melhorar
Adicionar novos exemplos, como:
Copiar arquivos entre diretórios.
Filtrar arquivos com base na extensão.
Implementar testes automatizados para validar as funcionalidades.

___

## ✍️ Contribuições
Fique à vontade para abrir issues ou enviar pull requests com melhorias e sugestões!

___

## 👨‍💻 Autor
Luciano Denio

✉️ lucianodenio@gmail.com  
[🌎 GitHub](https://github.com/LucianoDenio)


## 📄 Licença
Este projeto está licenciado sob a licença MIT. Consulte o arquivo LICENSE para mais detalhes.
```bash

### **Como ajustar**
- Atualize o link do repositório no comando `git clone`.
- Altere os caminhos para arquivos, se necessário, para refletir o ambiente da sua máquina.

Se precisar de algo mais ou alterações específicas, é só avisar! 😊


