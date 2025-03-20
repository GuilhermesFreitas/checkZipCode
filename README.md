# CheckZipCode☑️

Este é um projeto em Java para buscar informações sobre o CEP utilizando a API ViaCEP. A aplicação foi desenvolvida para uso no terminal (CLI), permitindo a pesquisa por CEP diretamente pela linha de comando.

## Tecnologias Utilizadas

- Java
- API ViaCEP
- OkHttp (para requisições HTTP)

## Como Rodar

1. Clone o repositório:
```bash
git clone https://github.com/GuilhermesFreitas/checkZipCode.git
```
2.Navegue até o diretório do projeto:
```
cd checkZipCode
```
3.Compile o projeto utilizando o Maven:
```
mvn clean install
```
4.Execute a aplicação:
```
java -jar target/checkZipCode.jar
```

## 📩 Contribuições

Se deseja contribuir com melhorias:
```
    Faça um fork do repositório.
    Crie uma nova branch (git checkout -b minha-feature).
    Commit suas alterações (git commit -m 'Adiciona nova funcionalidade').
    Envie a branch (git push origin minha-feature).
    Abra um Pull Request. 🚀
```

## 🧑‍💻Exemplo de uso: 
```
--- Sistema de Consulta de CEP📍 ---
Digite um CEP válido com 8 dígitos (ex: 01001000 ou 01001-000).
Digite 'sair' para encerrar o programa.

Digite o CEP: 01001000

📍 Endereço encontrado:
CEP: 01001-000
Logradouro: Praça da Sé
Bairro: Sé
Cidade: São Paulo - SP
DDD: 11
IBGE: 3550308

Deseja tentar novamente? (sim/não): sim

Digite o CEP: 02025000

📍 Endereço encontrado:
CEP: 02025-000
Logradouro: Rua Chavantes
Bairro: Vila Maria
Cidade: São Paulo - SP
DDD: 11
IBGE: 3550308

Deseja tentar novamente? (sim/não): não

Encerrando o programa...

```

## 🎖️ Créditos

Desenvolvido por **Guilherme Freitas**.  

Este projeto foi criado com o objetivo de praticar desenvolvimento em **Java** 

Agradecimentos especiais a todas as referências e materiais de estudo que ajudaram no desenvolvimento deste projeto.  

Caso tenha sugestões ou melhorias, fique à vontade para contribuir! 🚀


---

# CheckZipCode☑️

This is a Java project to search for ZIP code information using the ViaCEP API. The application was developed for terminal (CLI) usage, allowing ZIP code lookup directly from the command line.

## Technologies Used

- Java
- ViaCEP API
- OkHttp (for HTTP requests)

## How to Run

1. Clone the repository:
```bash
git clone https://github.com/GuilhermesFreitas/checkZipCode.git
```
2.Navigate to the project directory:
```
cd checkZipCode
```
3.Compile the project using Maven:
```
mvn clean install
```
4.Run the application:
```
java -jar target/checkZipCode.jar
```

## 📩 Contributions

If you want to contribute with improvements:
```
    Fork the repository.
    Create a new branch (git checkout -b my-feature).
    Commit your changes (git commit -m 'Add new feature').
    Push the branch (git push origin my-feature).
    Open a Pull Request. 🚀
```

## 🧑‍💻 Usage Example:
```
--- Sistema de Consulta de CEP📍 ---
Digite um CEP válido com 8 dígitos (ex: 01001000 ou 01001-000).
Digite 'sair' para encerrar o programa.

Digite o CEP: 01001000

📍 Endereço encontrado:
CEP: 01001-000
Logradouro: Praça da Sé
Bairro: Sé
Cidade: São Paulo - SP
DDD: 11
IBGE: 3550308

Deseja tentar novamente? (sim/não): sim

Digite o CEP: 02025000

📍 Endereço encontrado:
CEP: 02025-000
Logradouro: Rua Chavantes
Bairro: Vila Maria
Cidade: São Paulo - SP
DDD: 11
IBGE: 3550308

Deseja tentar novamente? (sim/não): não

Encerrando o programa...

```

## 🎖️ Credits

Developed by Guilherme Freitas.

This project was created to practice Java development.

Special thanks to all references and study materials that helped in the development of this project.

Feel free to contribute with suggestions or improvements! 🚀
