/* AED2 - AS2 - Dicionario com Autocompletar AVL
   Equipe:
   - Davi Ribeiro Oliveira Santos
   - Jose Fernandes Santana Neto
   - Rafael Augusto da Silva Januario
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "avl.h"

char *VOCABULARIO[] = {
    "apple", "application", "aparelhamento", "aparentado", "aparente",
    "apartamento", "aprender", "aprendiz", "aprovar", "aproximar",
    "arvore", "algoritmo", "analise", "arquivo", "atributo",
    "balanceamento", "binario", "busca", "biblioteca", "backup",
    "computador", "codigo", "compilador", "compilar", "complexidade",
    "dicionario", "dado", "depurar", "desempenho", "debug",
    "estrutura", "editor", "eficiencia", "entrada", "execucao",
    "funcao", "fila", "formatar", "fonte", "framework",
    "grafo", "gerenciamento", "gerador", "guia", "global",
    "hash", "heap", "hardware", "header", "historico",
    "indice", "inserir", "interface", "iteracao", "implementar",
    "java", "javascript", "json", "juntar", "juiz",
    "kernel", "keyword", "kit",
    "lista", "linguagem", "logaritmo", "linha", "loop",
    "memoria", "modulo", "metodo", "monitor", "manutenibilidade",
    "no", "numero", "nome", "nulo", "notacao",
    "objeto", "otimizar", "ordenar", "operador", "overflow",
    "ponteiro", "programa", "prefixo", "pilha", "portabilidade",
    "quebrar", "query", "quociente",
    "recursao", "raiz", "reducao", "robustez", "rotacao",
    "string", "subarvore", "sistema", "software", "sugestao",
    "tipo", "teste", "token", "tempo", "tabela",
    "usuario", "union", "utf", "unsigned", "uso",
    "variavel", "vetor", "void", "valor", "verificar",
    "while", "word", "workspace",
    "xml", "xor",
    "yaml",
    "zero", "zona"
};

void mostrarMenu() {
    printf("\n================ DICIONARIO AVL ================\n");
    printf(" 1) Inserir palavra\n");
    printf(" 2) Buscar por prefixo (autocompletar)\n");
    printf(" 3) Carregar vocabulario a partir de arquivo\n");
    printf(" 4) Sair\n");
    printf("================================================\n");
    printf("Escolha: ");
}

int main() {
    No *raiz = NULL;
    char buffer[256];
    int n = sizeof(VOCABULARIO) / sizeof(VOCABULARIO[0]);

    printf("Inicializando dicionario com vocabulario embutido...\n");
    carregarVocabulario(&raiz, VOCABULARIO, n);
    printf("%d palavras carregadas.\n", n);

    while (1) {
        mostrarMenu();

        if (fgets(buffer, 256, stdin) == NULL) {
            printf("\nEncerrando por EOF...\n");
            break;
        }
        int tam = strlen(buffer);
        if (tam > 0 && buffer[tam-1] == '\n') buffer[tam-1] = '\0';

        if (strcmp(buffer, "4") == 0 || strcmp(buffer, "sair") == 0) {
            break;
        }

        if (strcmp(buffer, "1") == 0) {
            printf("Digite a palavra a inserir: ");
            if (fgets(buffer, 256, stdin) == NULL) break;
            tam = strlen(buffer);
            if (tam > 0 && buffer[tam-1] == '\n') buffer[tam-1] = '\0';

            if (!palavraValida(buffer)) {
                printf("Entrada invalida: use apenas caracteres alfanumericos.\n");
                continue;
            }
            paraMinusculas(buffer);
            raiz = inserir(raiz, buffer);
            printf("Palavra '%s' inserida (duplicatas sao ignoradas).\n", buffer);
        }
        else if (strcmp(buffer, "2") == 0) {
            printf("Digite o prefixo: ");
            if (fgets(buffer, 256, stdin) == NULL) break;
            tam = strlen(buffer);
            if (tam > 0 && buffer[tam-1] == '\n') buffer[tam-1] = '\0';

            if (!palavraValida(buffer)) {
                printf("Prefixo invalido.\n");
                continue;
            }
            paraMinusculas(buffer);
            printf("Sugestoes para '%s':\n", buffer);
            int k = listarPrefixoEmOrdem(raiz, buffer);
            if (k == 0) {
                printf("  Nenhuma sugestao encontrada\n");
            } else {
                printf("(%d resultados)\n", k);
            }
        }
        else if (strcmp(buffer, "3") == 0) {
            printf("Nome do arquivo (uma palavra por linha): ");
            if (fgets(buffer, 256, stdin) == NULL) break;
            tam = strlen(buffer);
            if (tam > 0 && buffer[tam-1] == '\n') buffer[tam-1] = '\0';

            int qtd = carregarVocabularioDeArquivo(&raiz, buffer);
            if (qtd < 0)
                printf("Erro: nao foi possivel abrir o arquivo '%s'.\n", buffer);
            else
                printf("%d palavra(s) carregada(s) do arquivo.\n", qtd);
        }
        else if (buffer[0] == '\0') {
            continue;
        }
        else {
            printf("Opcao invalida. Use 1, 2, 3, 4 ou 'sair'.\n");
        }
    }

    liberarArvore(raiz);
    printf("Memoria liberada. Ate mais.\n");
    return 0;
}
