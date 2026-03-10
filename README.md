# Tarefa Módulo 40 - Spring Boot

Este projeto é uma API REST simples desenvolvida com Spring Boot para o gerenciamento de clientes. Ele foi criado como parte das tarefas do Módulo 40 do curso de Backend Java.

## 🚀 O que o projeto faz?

A aplicação permite realizar operações básicas de gerenciamento de clientes, incluindo:
*   **Listar Clientes**: Retorna todos os clientes cadastrados no banco de dados.
*   **Cadastrar Cliente**: Salva um novo cliente enviando os dados via JSON.

## 🛠️ Tecnologias Utilizadas

O projeto utiliza as seguintes tecnologias e bibliotecas:

*   **Java 17**: Linguagem de programação principal.
*   **Spring Boot**: Framework para facilitar o desenvolvimento de aplicações Java.
    *   **Spring Data JPA**: Para persistência de dados.
    *   **Spring Web**: Para criação de endpoints REST.
    *   **Spring Actuator**: Para monitoramento da aplicação.
*   **PostgreSQL**: Banco de dados relacional para armazenamento dos dados.
*   **Hibernate**: Framework de ORM (Object-Relational Mapping).
*   **Lombok**: Para redução de código boilerplate (Getters, Setters, etc.).
*   **Maven**: Ferramenta de gerenciamento de dependências e build.

## 📋 Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina:
*   [JDK 17](https://www.oracle.com/java/technologies/downloads/#java17) ou superior.
*   [Maven](https://maven.apache.org/download.cgi).
*   [PostgreSQL](https://www.postgresql.org/download/).

## 🔧 Como baixar e instalar

### 1. Clonar o repositório
```bash
git clone <url-do-repositorio>
cd TarefaModulo40
```

### 2. Configurar o Banco de Dados
Certifique-se de que o PostgreSQL está rodando e crie um banco de dados chamado `tarefa_mod_40`:
```sql
CREATE DATABASE tarefa_mod_40;
```

A configuração de conexão está no arquivo `src/main/resources/application.properties`. Se o seu usuário ou senha do PostgreSQL forem diferentes de `postgres/1234`, altere as seguintes linhas:
```properties
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```

### 3. Instalar dependências e rodar a aplicação
No terminal, dentro da pasta do projeto, execute:
```bash
mvn clean install
mvn spring-boot:run
```

A aplicação estará disponível em `http://localhost:8080`.

## 🛣️ Endpoints Principais

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| `GET` | `/clientes` | Lista todos os clientes cadastrados. |
| `POST` | `/clientes` | Cadastra um novo cliente. |

### Exemplo de JSON para o POST `/clientes`:
```json
{
  "nome": "Eduardo Silva",
  "cpf": 12345678901,
  "tel": 11988887777,
  "email": "eduardo@email.com",
  "end": "Rua Exemplo",
  "numero": 100,
  "cidade": "São Paulo",
  "estado": "SP"
}
```

---
Desenvolvido por **Eduardo** para o curso de Backend Java.
