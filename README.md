# Back-End Frameworks — Atividade Prática

Aplicação Spring Boot desenvolvida como atividade prática da disciplina Back-End Frameworks, com o objetivo de aplicar os conceitos de Controller, Service e Injeção de Dependência.

## Objetivo

Criar uma aplicação estruturada em camadas, onde o Controller recebe as requisições HTTP e delega a lógica de resposta para o Service sem gerar as mensagens diretamente.

## Tecnologias

- Java 21
- Spring Boot
- Maven

## Estrutura do projeto

```
src/main/java/br/edu/nassau/backend_frameworks_atividade/
├── controller/
│   ├── CursoController.java
│   └── AlunoController.java
└── service/
    ├── CursoService.java
    └── AlunoService.java
```

## Endpoints

| Método | Rota | Resposta |
|---|---|---|
| GET | `/curso` | Ciência da Computação |
| GET | `/disciplina` | Back-End Frameworks |
| GET | `/aluno` | Aluno matriculado em Back-End Frameworks |

## Como executar

1. Clone o repositório
2. Abra o projeto no IntelliJ IDEA
3. Execute a classe `BackendFrameworksAtividadeApplication`
4. Acesse os endpoints em `http://localhost:8080`

## Conceitos aplicados

- **Controller**: recebe as requisições HTTP e repassa para o Service
- **Service**: contém a regra de negócio (as respostas)
- **Injeção de Dependência**: o Spring cria e entrega os objetos automaticamente via construtor