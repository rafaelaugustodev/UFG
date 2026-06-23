# AED1 — Algoritmos e Estruturas de Dados 1

Implementações em **C** focadas em eficiência algorítmica, gerenciamento de memória e estruturas de dados clássicas. Os exercícios estão organizados pela origem/plataforma em que foram resolvidos.

## 📂 Subpastas

| Pasta | Origem | Conteúdo |
|-------|--------|----------|
| [Boca/](Boca/) | Juiz online **BOCA** | Exercícios agrupados por tema: `B*` (busca), `F*` (filas), `L*` (listas), `Mat*` (matrizes), `O*` (ordenação), `P*` (pilhas), `R*` (recursividade). |
| [Turring/](Turring/) | Plataforma **Turing** | Exercícios de matrizes e manipulação de dados (`mat1.c` … `mat7.c`). |

## 🧠 Conceitos abordados

* **Alocação dinâmica:** uso de `malloc`, `free` e ponteiros.
* **Estruturas lineares:** listas encadeadas, pilhas (stacks) e filas (queues).
* **Ordenação e busca:** busca binária, bubble sort, entre outros métodos.
* **Recursividade:** problemas como N-Queens e labirintos.
* **Matrizes e otimização:** matrizes esparsas, tabelas hash e aritmética de ponteiros.

## ▶️ Como rodar

Você precisa do compilador `gcc` instalado.

1. Compile o arquivo desejado (ajuste o caminho da subpasta):

   ```bash
   gcc Boca/L1.c -o saida
   ```

2. Execute:

   ```bash
   ./saida        # Linux / macOS
   saida.exe      # Windows
   ```

> 💡 Vários exercícios usam funções matemáticas (`math.h`). Nesses casos, adicione a flag `-lm`:
> ```bash
> gcc Boca/Mat1.c -o saida -lm
> ```
