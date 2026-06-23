# AED2 — Algoritmos e Estruturas de Dados 2

Projetos em **C** sobre estruturas de dados não lineares, com foco em **árvores de busca**. Diferente de IP e AED1, aqui cada pasta é um projeto composto por **vários arquivos** (`.c` + `.h`) que precisam ser compilados juntos.

## 📂 Projetos

### [AS1_RafaelJanuario/](AS1_RafaelJanuario/) — Árvore Binária de Busca

Implementação de uma Árvore Binária de Busca (ABB), incluindo uma fila auxiliar para percursos.

* `ArvoreBinaria.c` / `.h` — implementação da árvore.
* `Fila.c` / `.h` — fila auxiliar (usada em percurso por nível).
* `TestaArvoreBinaria.c` — programa principal (`main`) que testa a árvore.

**Compilar e rodar:**

```bash
cd AS1_RafaelJanuario
gcc TestaArvoreBinaria.c ArvoreBinaria.c Fila.c -o saida
./saida        # ou saida.exe no Windows
```

### [AS1_RafaelJanuario_JoseNeto_DaviSantos/](AS1_RafaelJanuario_JoseNeto_DaviSantos/) — Dicionário com Autocompletar (AVL)

Projeto em equipe: dicionário com função de autocompletar usando uma **árvore AVL** (balanceada).

* `avl.c` / `.h` — implementação da árvore AVL.
* `main.c` — programa principal com o vocabulário e a lógica de autocompletar.

**Compilar e rodar:**

```bash
cd AS1_RafaelJanuario_JoseNeto_DaviSantos
gcc main.c avl.c -o saida
./saida        # ou saida.exe no Windows
```

## ℹ️ Observações

* Os arquivos `.dev` são projetos do **Dev-C++**. Você pode abri-los direto na IDE em vez de compilar pela linha de comando — o resultado é o mesmo.
* É necessário ter o compilador `gcc` instalado.
* Lembre-se de **listar todos os `.c` do projeto** no comando de compilação; compilar apenas o `main` resultará em erro de referência (símbolos não encontrados).
