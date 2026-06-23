# POO — Programação Orientada a Objetos

Exercícios e atividades em **Java**, cobrindo desde os fundamentos de classes e objetos até herança, polimorfismo, interfaces, coleções, manipulação de arquivos e testes automatizados.

Cada pasta (`atv*`, `list1`, `list2`) é uma atividade independente. As classes com método `main` — geralmente chamadas `Main`, `Principal` ou `Teste...` — são o ponto de entrada de cada exercício.

## 📑 Atividades

| Pasta | Tema principal |
|-------|----------------|
| [atv1/](atv1/) | Classes e objetos: `Pessoa`, `Contato` (dois exercícios em `ex1/` e `ex2/`). |
| [atv2/](atv2/) | Encapsulamento: classe `Produto`. |
| [atv3/](atv3/) | Construtores e atributos (`ex1/` Pessoa, `ex2/` Produto). |
| [atv4/](atv4/) | Associação entre classes (Empresa, Curso, Música etc.). |
| [atv5/](atv5/) | Herança: hierarquia de contas bancárias. |
| [atv6/](atv6/) | Relacionamento Empresa × Projeto. |
| [atv7/](atv7/) | Interfaces e padrão Fábrica (documentos/notificações). |
| [atv8/](atv8/) | Manipulação de arquivos (leitura/gravação de funcionários, `funcionarios.txt`). |
| [atv9/](atv9/) | Testes unitários com **JUnit** (cálculo de imposto). |
| [atv10/](atv10/) | Coleções: agenda de clientes e horários. |
| [atv11/](atv11/) | Sistema de cinema (filmes, artistas, salas). |
| [list1/](list1/) | Lista de exercícios 1: classe `Aluno`. |
| [list2/](list2/) | Lista de exercícios 2: 10 exercícios variados (`ex1/` … `ex10/`). |

## ▶️ Como rodar

Você precisa do **JDK** instalado (comandos `javac` e `java`).

1. Entre na pasta do exercício:

   ```bash
   cd atv1/ex1
   ```

2. Compile os arquivos `.java`:

   ```bash
   javac *.java
   ```

3. Execute a classe que contém o `main` (sem a extensão `.class`):

   ```bash
   java Main
   ```

   > A classe de entrada varia por atividade: pode ser `Main`, `Principal` ou `Teste...`. Procure a que define `public static void main`.

## 🧪 Rodando os testes (atv9)

A `atv9` usa **JUnit 4**. É necessário ter os `.jar` do JUnit e do Hamcrest no classpath:

```bash
cd atv9
javac -cp .:junit-4.13.2.jar Pessoa.java PessoaTest.java
java -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore PessoaTest
```

> No Windows, troque os `:` por `;` no classpath. O mais prático é rodar os testes pela IDE (VS Code, Eclipse ou IntelliJ), que já gerenciam essas dependências.
