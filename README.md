# Exemplo de Vendas Multi-Banco - Módulo 36

Este é um projeto **didático e de estudo**, desenvolvido como parte do Módulo 36. O foco principal desta evolução é a validação de acesso e persistência a **múltiplos bancos de dados** (PostgreSQL e MySQL) utilizando a mesma aplicação, através da configuração de múltiplas *persistence-units* com o JPA (Hibernate), e utilizando testes automatizados com JUnit para assegurar a consistência dos dados em cada ambiente.

O projeto estende o sistema simplificado de vendas (Cliente, Produto, Venda) validando as entidades de forma distribuída.

## 🚀 Tecnologias Utilizadas

Este projeto foi construído utilizando as seguintes tecnologias:

- **Java 11+**
- **JPA** (Java Persistence API) com **Hibernate** como framework de mapeamento objeto-relacional (ORM).
- **PostgreSQL** como banco de dados relacional principal (2 instâncias).
- **MySQL** como banco de dados relacional alternativo para testes em multi-banco.
- **JUnit 4** para testes unitários e de integração multibase.
- IDE configurada nativamente: **Eclipse IDE** (projetos com dependências .jar inclusas na pasta `lib/`, sem Maven).

## ⚙️ Arquitetura e Padrões

- **Múltiplos Bancos de Dados**: Manipulação simultânea de dados em bancos distintos (`Postgre1`, `Postgre2` e `Mysql1`).
- **Padrão DAO (Data Access Object)** para abstrair e isolar o acesso a dados de cada base de dados respectiva.
- **GenericDAO Multi-Banco**: Classes genéricas parametrizadas preparadas para receber a instrução de qual base de dados gerenciar.
- **Testes de Integração Independentes**: Testes exclusivos validados (ex: `ClienteJpaDao2BancosTest` e `ClienteJpaDao3BancosTest`).

## 📋 Pré-requisitos

Para rodar este projeto na sua máquina, você precisa das seguintes ferramentas:

1. [JDK 11+](https://adoptium.net/) instalada e configurada nas variáveis de ambiente.
2. [PostgreSQL](https://www.postgresql.org/download/) instalado e rodando na porta padrão (5432).
3. [MySQL](https://dev.mysql.com/downloads/installer/) instalado e rodando na porta padrão (3306).
4. Eclipse IDE (recomendado) ou IntelliJ IDEA.

### Configuração dos Bancos de Dados

Nesta configuração de múltiplos bancos com JPA (`hibernate.hbm2ddl.auto = update`), será necessário apenas criar as databases vazias. O Hibernate cuidará da criação das tabelas para testes. 

Por padrão, a aplicação espera as seguintes credenciais de acesso:
* **PostgreSQL** -> user: `postgres`, password: `1234`
* **MySQL** -> user: `root`, password: `1234`

(Você pode alterar as credenciais no arquivo `src/main/java/META-INF/persistence.xml`).

Crie as seguintes *Databases* (bancos) em seus sistemas SGBD de forma manual:

**No PostgreSQL:**
```sql
CREATE DATABASE vendas_online;
CREATE DATABASE vendas_online_2;
```

**No MySQL:**
```sql
CREATE DATABASE ebac;
```

## 🛠️ Como Clonar e Rodar

1. Importe o projeto no seu **Eclipse**:
   - Vá em `File > Import...`
   - Selecione `General > Existing Projects into Workspace` e clique em `Next >`.
   - Navegue até o diretório raiz deste projeto e clique em `Finish`.

2. **Configuração de Bibliotecas (Build Path)**:
   Como o projeto não utiliza Maven, todas as bibliotecas requeridas estão fisicamente presentes na pasta `/lib`. Se a IDE apresentar erros nas importações das classes de teste ou do Hibernate, garanta que todas as bibliotecas da pasta `lib/` e suas subpastas (como o `junit`) foram incluídas em:
   `Right Click no Projeto > Build Path > Configure Build Path > Aba Libraries > Add JARs...`

3. **Passos para rodar a Validação Multi-Banco**:
   Para testar a integração dos três diferentes bancos de dados atuando juntos:
   - Navegue até o pacote `br.com.eduardo.jpa` dentro da source folder de testes `src/test/java`.
   - Clique com o botão direito nas classes de teste (ex: `ClienteJpaDao3BancosTest.java` ou em `AllTests.java` para a bateria completa) > `Run As... > JUnit Test`.

## 🧑‍💻 Autor

Desenvolvido e refatorado por **Eduardo** (anteriormente creditado a rodrigo.pires).