# Sistema de Gerenciamento de Tarefas - Spring Boot

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.1.5-brightgreen)
![License](https://img.shields.io/badge/License-MIT-blue)

Um CRUD completo para gerenciamento de tarefas desenvolvido com Spring Boot, seguindo boas práticas de API REST.

## 📋 Funcionalidades

- ✅ **CRUD completo** de tarefas
- ✅ Validação de dados
- ✅ Tratamento de erros personalizado
- ✅ Padrão RESTful
- ✅ Persistência em banco de dados (JPA/H2 ou MySQL)

## 🛠 Tecnologias

- **Java 17**
- **Spring Boot 3.1.5**
  - Spring Web (REST API)
  - Spring Data JPA
  - Hibernate Validator
- **Banco de dados**: H2 (dev) / MySQL (prod)
- **Maven** (Gerenciamento de dependências)

## 🔌 Endpoints da API

| Método | Endpoint       | Descrição                     |
|--------|----------------|-------------------------------|
| GET    | /tarefas       | Lista todas as tarefas        |
| GET    | /tarefas/{id}  | Obtém uma tarefa específica   |
| POST   | /tarefas       | Cria uma nova tarefa          |
| PUT    | /tarefas/{id}  | Atualiza uma tarefa existente |
| DELETE | /tarefas/{id}  | Remove uma tarefa             |

## 📦 Estrutura do Projeto
