# IP — Introdução à Programação

Disciplina de fundamentos da lógica de programação usando a linguagem **C**. Os arquivos evoluem de conceitos básicos (entrada/saída) até estruturas de dados multidimensionais (matrizes).

Cada arquivo é um exercício independente, nomeado por uma **letra** (tema) seguida de um **número** (exercício): `A1.c`, `A2.c`, ..., `F10.c`.

## 📑 Organização por tema

| Prefixo | Tema | Descrição |
|---------|------|-----------|
| `A*.c` | Fundamentos | Entrada/saída e operações aritméticas. |
| `B*.c` | Controle de fluxo | Estruturas condicionais (`if/else`, `switch`). |
| `C*.c` | Repetição | Laços (`for`, `while`) e acumuladores. |
| `D*.c` | Modularização | Criação e uso de funções. |
| `E*.c` | Vetores (arrays) | Manipulação de dados lineares e ordenação simples. |
| `F*.c` | Matrizes | Arrays multidimensionais: multiplicação, transposição etc. |

## ▶️ Como rodar

Você precisa do compilador `gcc` instalado.

1. Compile o arquivo desejado:

   ```bash
   gcc A1.c -o saida
   ```

2. Execute:

   ```bash
   ./saida        # Linux / macOS
   saida.exe      # Windows
   ```

> 💡 Se o arquivo usar funções matemáticas (`math.h`), adicione a flag `-lm`:
> ```bash
> gcc F1.c -o saida -lm
> ```
