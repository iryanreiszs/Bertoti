# 📚 Projetos Spring Boot - Lab3 (bertoti)

Este repositório contém dois projetos desenvolvidos com **Spring Boot + Java**, com foco em aprender na prática o funcionamento de APIs REST e integração com banco de dados e frontend.

---

# 🚀 Projeto 1 - CRUD de Usuários

## 📌 Descrição

API REST simples que realiza operações CRUD (Create, Read, Update, Delete) para a entidade **Usuário**, utilizando banco de dados em memória (H2).

## 🛠 Tecnologias

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* H2 Database

## 📡 Rotas disponíveis

* `GET /usuarios` → Lista todos os usuários
* `GET /usuarios/{id}` → Busca usuário por ID
* `POST /usuarios` → Cria um novo usuário
* `PUT /usuarios/{id}` → Atualiza um usuário
* `DELETE /usuarios/{id}` → Remove um usuário

## 🧪 Exemplo JSON (POST)

```json
{
  "nome": "Ryan",
  "email": "ryan@email.com"
}
```

---

# 🚀 Projeto 2 - API de Produtos + Frontend

## 📌 Descrição

Sistema completo com:

* Backend em Spring Boot (API REST)
* Frontend simples em HTML + JavaScript
* Integração com banco de dados (H2)

## 🛠 Tecnologias

* Java
* Spring Boot
* Spring Data JPA
* H2 Database
* HTML + JavaScript (Fetch API)

---

## 📡 Rotas disponíveis

* `GET /produtos` → Lista produtos
* `POST /produtos` → Cria produto
* `PUT /produtos/{id}` → Atualiza produto
* `DELETE /produtos/{id}` → Remove produto

---

## 💻 Frontend

O frontend está localizado em:

```
src/main/resources/static/index.html
```

### Funcionalidades:

* Adicionar produtos
* Listar produtos
* Remover produtos

### Acesso:

```
http://localhost:8080
```

---

## 🧪 Exemplo JSON (POST)

```json
{
  "nome": "Notebook",
  "preco": 3500
}
```

---

# ⚙️ Como executar os projetos

1. Abrir no IntelliJ
2. Garantir Java 17+
3. Rodar a classe principal (`Projeto1Application` ou `Projeto2Application`)
4. Acessar via navegador ou Postman

---

# 🧠 Aprendizados

Com esses projetos foi possível praticar:

* Criação de APIs REST
* Estrutura MVC (Model, Repository, Controller)
* Integração com banco de dados
* Uso do Spring Boot
* Consumo de API no frontend (JavaScript)

---

# 📌 Observações

* O banco H2 é em memória (os dados são perdidos ao reiniciar)
* Ideal para fins de estudo e testes

---

# 👨‍💻 Autor
RYAN REIS POLTRONIERI
Projeto desenvolvido para fins acadêmicos (Lab3 - bertoti)

