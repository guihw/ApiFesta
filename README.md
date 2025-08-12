# API Festa - Sistema de Gerenciamento de Pessoas

Este projeto foi desenvolvido como parte das atividades da disciplina de **Programação Orientada a Objetos (POO) em Java** da **Universidade Cesumar (Unicesumar)**.

## 📋 Descrição

A API Festa é uma aplicação REST desenvolvida em Spring Boot que permite o gerenciamento de pessoas para eventos ou festas. O sistema oferece funcionalidades básicas de CRUD (Create, Read, Update, Delete) para cadastro e consulta de participantes.

## 🎯 Objetivos Acadêmicos

Este projeto demonstra a aplicação prática dos conceitos de Programação Orientada a Objetos estudados na disciplina, incluindo:

- **Encapsulamento**: Uso de classes modelo com getters e setters
- **Abstração**: Separação de responsabilidades em camadas (Controller, Service, Repository)
- **Organização de código**: Estruturação em packages seguindo boas práticas
- **Padrões de projeto**: Implementação do padrão MVC e injeção de dependência

## 🛠️ Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **H2 Database** (banco em memória)
- **Maven** (gerenciamento de dependências)

## 📁 Estrutura do Projeto

```
src/
├── main/
│   ├── java/com/cesu/apiFesta/
│   │   ├── controller/          # Controladores REST
│   │   │   └── Endpoints.java
│   │   ├── dto/                 # Data Transfer Objects
│   │   │   └── PessoaDTO.java
│   │   ├── model/               # Entidades JPA
│   │   │   └── PessoaModel.java
│   │   ├── repository/          # Repositórios de dados
│   │   │   └── PessoaRepository.java
│   │   ├── service/             # Camada de serviços
│   │   │   └── PessoaService.java
│   │   └── ApiFestaApplication.java
│   └── resources/
│       └── application.properties
└── test/
    └── java/com/cesu/apiFesta/
        └── ApiFestaApplicationTests.java
```

## 🚀 Como Executar

### Pré-requisitos
- Java 17 ou superior instalado
- Maven instalado (ou usar o wrapper incluído)

### Passos para execução

1. **Clone ou baixe o projeto**
   ```bash
   git clone [url-do-repositório]
   cd apiFesta
   ```

2. **Execute a aplicação**
   ```bash
   ./mvnw spring-boot:run
   ```
   
   Ou, se preferir:
   ```bash
   mvn spring-boot:run
   ```

3. **Acesse a aplicação**
   - API: `http://localhost:8080`
   - Console H2: `http://localhost:8080/h2-console`
     - URL JDBC: `jdbc:h2:mem:feb372cb-e449-4ab3-b797-6c0bc01b9005`
     - Usuário: `sa`
     - Senha: (deixar em branco)

## 📡 Endpoints da API

### Base URL: `http://localhost:8080/api/pessoas`

| Método | Endpoint | Descrição | Exemplo de Body |
|--------|----------|-----------|-----------------|
| `GET` | `/` | Lista todas as pessoas | - |
| `POST` | `/` | Cadastra uma nova pessoa | `{"nome": "João Silva", "cpf": "12345678901", "idade": 25}` |

## Endpoint
POST /api/pessoas

Descrição: Cadastra uma nova pessoa
URL completa: http://localhost:8080/api/pessoas
Body (JSON):
```
json{
  "nome": "João Silva",
  "cpf": "12345678901",
  "idade": 25
}
```

### Exemplos de Requisições

**Listar todas as pessoas:**
```bash
curl -X GET http://localhost:8080/api/pessoas
```

**Cadastrar uma nova pessoa:**
```bash
curl -X POST http://localhost:8080/api/pessoas \
  -H "Content-Type: application/json" \
  -d '{"nome": "Maria Santos", "cpf": "98765432100", "idade": 30}'
```

## 💾 Modelo de Dados

### Entidade Pessoa
- **id** (Long): Identificador único (gerado automaticamente)
- **nome** (String): Nome completo da pessoa
- **cpf** (String): CPF da pessoa
- **idade** (int): Idade da pessoa

## 🏗️ Arquitetura

O projeto segue o padrão arquitetural **MVC (Model-View-Controller)** adaptado para APIs REST:

- **Model** (`PessoaModel`): Representa a entidade no banco de dados
- **Controller** (`Endpoints`): Gerencia as requisições HTTP
- **Service** (`PessoaService`): Contém a lógica de negócio
- **Repository** (`PessoaRepository`): Responsável pela persistência dos dados
- **DTO** (`PessoaDTO`): Objeto para transferência de dados

## 🎓 Conceitos de POO Aplicados

1. **Classes e Objetos**: Definição da classe `PessoaModel` com seus atributos e métodos
2. **Encapsulamento**: Atributos privados com métodos de acesso (getters/setters)
3. **Abstração**: Interfaces como `JpaRepository` e separação por camadas
4. **Injeção de Dependência**: Uso da anotação `@Autowired` para inversão de controle

## 📚 Aprendizados

Este projeto permitiu aplicar na prática:
- Desenvolvimento de APIs REST com Spring Boot
- Uso de anotações do Spring Framework
- Conceitos de persistência com JPA/Hibernate
- Organização de código em camadas
- Boas práticas de programação orientada a objetos

## 🏫 Informações Acadêmicas

- **Instituição**: Universidade Cesumar (Unicesumar)
- **Disciplina**: Programação Orientada a Objetos em Java
- **Tipo**: Atividade Prática

---

**Desenvolvido como parte do curso de Análise e Desenvolvimento de Sistemas na Unicesumar** 🎓
