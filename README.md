# Vendas Online - Projeto Monolítico Web

Este é um projeto de um sistema de gestão de vendas on-line desenvolvido como parte do curso de Backend Java. O sistema é construído utilizando uma arquitetura monolítica convencional com Java EE, focando na integração de uma interface web dinâmica com persistência em banco de dados relacional.

## 🚀 Tecnologias Utilizadas

O projeto utiliza as seguintes tecnologias e frameworks:

- **Linguagem**: Java 11 (Maven Compiler 3.8.0)
- **Framework Web**: JSF (JavaServer Faces) 2.2+
- **Componentes UI**: PrimeFaces 5.3 + Temas PrimeFaces (Bootstrap)
- **Persistência (ORM)**: JPA (Java Persistence API) com Hibernate
- **Banco de Dados**: PostgreSQL 42.3.2
- **Gerenciador de Dependências**: Maven
- **Servidor de Aplicação**: WildFly / JBoss (com suporte a JTA)

## 📋 Funcionalidades Principais

O sistema permite gerenciar as principais entidades de um fluxo de vendas:

1.  **Gestão de Clientes**: Cadastro, edição, exclusão e visualização (CRUD) de clientes.
2.  **Gestão de Produtos**: Cadastro de produtos com informações de preço e validade.
3.  **Gestão de Vendas**:
    - Criação de pedidos de venda.
    - Associação de múltiplos produtos a uma venda (com controle de quantidades individuais).
    - Cálculo automático de totais da venda.
    - Controle de status da venda (Iniciado, Finalizado, Cancelado).

## 🏗️ Estrutura do Projeto

O projeto segue a arquitetura em camadas tradicional do ecossistema Java:

- **`br.com.rpires.domain`**: Contém as entidades JPA que representam as tabelas do banco de dados (`Cliente`, `Produto`, `Venda`).
- **`br.com.rpires.dao`**: Camada de acesso a dados (Data Access Object) utilizando JPA e repositórios genéricos.
- **`br.com.rpires.service`**: Camada de lógica de negócio e serviços que intermedeia o acesso aos DAOs.
- **`br.com.rpires.controller`**: `ManagedBeans` do JSF que controlam o fluxo entre a interface visual (`.xhtml`) e a camada de serviço.
- **`src/main/webapp`**: Contém as páginas da interface (`.xhtml`) organizadas por módulos: `/cliente`, `/produto`, `/venda`.

## ⚙️ Configuração do Banco de Dados

A persistência utiliza JPA com transações controladas pelo servidor de aplicação (JTA).
- O arquivo de configuração reside em `src/main/resources/META-INF/persistence.xml`.
- O nome da unidade de persistência é `prod`.
- **Importante**: O sistema está configurado para utilizar um DataSource chamado `java:/PostGreDS`.

## 🛠️ Como Instalar e Executar

### Pré-requisitos
- **Java JDK 11** instalado.
- **Apache Maven** (v3.6+) configurado.
- **PostgreSQL** instalado e rodando.
- **Servidor WildFly** (recomendado versão 10 ou superior) com o DataSource `java:/PostGreDS` devidamente configurado no `standalone.xml`.

### Passo a Passo

1.  **Clone o repositório** ou baixe os arquivos em seu ambiente local.
    
2.  **Configuração do PostgreSQL**:
    - Crie um banco de dados vazio (ex: `vendas_online`).

3.  **Configuração do WildFly**:
    - Configure o driver do PostgreSQL como um módulo no WildFly.
    - Crie o DataSource `java:/PostGreDS` no arquivo `standalone.xml` apontando para o banco `vendas_online`.

4.  **Compilação do Projeto**:
    Na raiz do projeto, execute o comando Maven:
    ```bash
    mvn clean install
    ```
    Isso gerará o arquivo `VendasOnline.war` na pasta `target`.

5.  **Deploy e Acesso**:
    - Faça o deploy do arquivo `.war` gerado em seu servidor WildFly.
    - Acesse através do navegador em: `http://localhost:8080/VendasOnline`

---
*Este projeto foi desenvolvido como um exercício prático de modelagem de sistemas web monolíticos e persistência com JPA.*
