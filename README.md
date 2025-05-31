# Resumo Geral do Projeto de Internato Médico

## O que foi implementado até agora:

### ✅ Modelagem de Dados Completa

- Criação de todas as entidades do sistema (`SemestreLetivo`, `Usuario`, `Aluno`, `LocalParceiro`, etc.)
- Relacionamentos entre as entidades mapeados corretamente

### ✅ Camadas da Arquitetura

- **Models** (entidades JPA)
- **Repositories** (interfaces Spring Data JPA)
- **Services** (lógica de negócio)
- **Controllers** (endpoints REST)
- **DTOs** (objetos de transferência de dados)

### ✅ Documentação da API

- Configuração do **Swagger/OpenAPI** para documentação interativa
- Anotações para melhorar a documentação dos endpoints

### ✅ Funcionalidades Básicas

- CRUD completo para `SemestreLetivo` e `Usuario`
- Validações básicas e tratamento de erros

---

## 🧠 Explicação Didática das Componentes

### 1. **Model (Modelo)**

**O que é:**  
Classes que representam as tabelas do banco de dados.

**Para que serve:**
- Definir a estrutura dos dados que serão armazenados
- Mapear objetos para o banco de dados (ORM)
- Estabelecer relacionamentos entre tabelas

**Exemplo Prático:**  
A classe `Aluno` representa a tabela `aluno` no banco de dados, com todos seus campos e relacionamentos.

---

### 2. **Repository (Repositório)**

**O que é:**  
Interfaces que facilitam o acesso ao banco de dados.

**Para que serve:**
- Operações CRUD básicas sem escrever SQL
- Consultas personalizadas com métodos nomeados corretamente
- Ponte entre a aplicação e o banco de dados

**Exemplo Prático:**  
`UsuarioRepository` permite buscar usuários por email sem escrever a query manualmente.

---

### 3. **Service (Serviço)**

**O que é:**  
Classes que contêm a lógica de negócio da aplicação.

**Para que serve:**
- Implementar regras de negócio complexas
- Coordenar operações entre múltiplos repositórios
- Validar dados antes de persistir
- Transformar modelos em DTOs e vice-versa

**Exemplo Prático:**  
`SemestreLetivoService` verifica se já existe um semestre com o mesmo rótulo antes de salvar.

---

### 4. **Controller (Controlador)**

**O que é:**  
Classes que lidam com requisições HTTP e devolvem respostas.

**Para que serve:**
- Definir os endpoints da API
- Receber requisições e delegar para os serviços
- Retornar respostas no formato adequado (JSON, XML)
- Gerenciar códigos de status HTTP

**Exemplo Prático:**  
`UsuarioController` expõe endpoints como `/api/usuarios` para operações com usuários.

---

### 5. **DTO (Data Transfer Object)**

**O que é:**  
Objetos simples que carregam dados entre as camadas.

**Para que serve:**
- Evitar expor os modelos diretamente na API
- Controlar exatamente quais dados são enviados/recebidos
- Adaptar os dados entre diferentes camadas
- Reduzir a quantidade de dados trafegados

**Exemplo Prático:**  
`UsuarioDTO` mostra apenas nome, email e tipo, sem expor a senha.

---

## 📝 Explicação sobre Swagger

### O que é Swagger?

**Swagger** (agora chamado **OpenAPI**) é um conjunto de ferramentas para documentação de APIs REST.

### Para que serve?

- **Documentação Automatizada:** Gera documentação interativa automaticamente baseada no código
- **Teste de Endpoints:** Permite testar a API diretamente da interface
- **Padronização:** Mantém um padrão consistente na documentação
- **Facilita Integração:** Desenvolvedores frontend entendem a API com mais facilidade

### Como funciona no projeto?

- **Configuração:** Dependência adicionada e classe de configuração básica implementada
- **Anotações:** Controllers e métodos anotados com informações adicionais
- **Interface Web:** Acessível via `/swagger-ui.html` para visualização e testes

### Benefícios para o projeto:

- Documentação sem esforço (atualiza automaticamente com o código)
- Testes facilitados (sem precisar de Postman ou Insomnia)
- Melhor comunicação entre a equipe
- Validação precoce dos endpoints

### Exemplo Visual:

A interface do Swagger mostra:
- Todos os endpoints organizados por **tags**
- Detalhes de cada operação (método HTTP, parâmetros, etc.)
- Modelos de requisição/resposta
- Botão **"Try it out"** para testes diretos na interface

---

## 🔜 Próximos Passos Sugeridos:

- Implementar os `controllers`, `services` e `repositórios` restantes
- Adicionar **autenticação e autorização** (Spring Security)
- Desenvolver funcionalidades específicas do negócio:
    - Alocação de alunos
    - Check-in georreferenciado
- Melhorar a documentação com mais exemplos e descrições
- Implementar **testes automatizados**
