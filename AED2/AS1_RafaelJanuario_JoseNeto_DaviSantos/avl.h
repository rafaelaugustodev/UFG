#ifndef AVL_H
#define AVL_H

typedef struct No {
    char *palavra;
    int altura;
    struct No *esq;
    struct No *dir;
} No;

No* inserir(No *raiz, char *palavra);
No* buscarPrimeiroPrefixo(No *raiz, char *prefixo);
int listarPrefixoEmOrdem(No *raiz, char *prefixo);

void carregarVocabulario(No **raiz, char *palavras[], int n);
int carregarVocabularioDeArquivo(No **raiz, char *nomeArquivo);

void liberarArvore(No *raiz);

int palavraValida(char *s);
void paraMinusculas(char *s);

#endif
