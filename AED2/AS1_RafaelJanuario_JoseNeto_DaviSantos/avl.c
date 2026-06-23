#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include "avl.h"

int altura(No *n) {
    if (n == NULL) return 0;
    return n->altura;
}

int maior(int a, int b) {
    if (a > b) return a;
    return b;
}

int fatorBalanceamento(No *n) {
    if (n == NULL) return 0;
    return altura(n->esq) - altura(n->dir);
}

No* novoNo(char *palavra) {
    No *n = (No*) malloc(sizeof(No));
    n->palavra = (char*) malloc(strlen(palavra) + 1);
    strcpy(n->palavra, palavra);
    n->altura = 1;
    n->esq = NULL;
    n->dir = NULL;
    return n;
}

No* rotacaoDireita(No *y) {
    No *x = y->esq;
    No *T2 = x->dir;
    x->dir = y;
    y->esq = T2;
    y->altura = 1 + maior(altura(y->esq), altura(y->dir));
    x->altura = 1 + maior(altura(x->esq), altura(x->dir));
    return x;
}

No* rotacaoEsquerda(No *x) {
    No *y = x->dir;
    No *T2 = y->esq;
    y->esq = x;
    x->dir = T2;
    x->altura = 1 + maior(altura(x->esq), altura(x->dir));
    y->altura = 1 + maior(altura(y->esq), altura(y->dir));
    return y;
}

No* inserir(No *raiz, char *palavra) {
    if (raiz == NULL) return novoNo(palavra);

    int cmp = strcmp(palavra, raiz->palavra);
    if (cmp < 0)
        raiz->esq = inserir(raiz->esq, palavra);
    else if (cmp > 0)
        raiz->dir = inserir(raiz->dir, palavra);
    else
        return raiz;

    raiz->altura = 1 + maior(altura(raiz->esq), altura(raiz->dir));
    int balanco = fatorBalanceamento(raiz);

    if (balanco > 1 && strcmp(palavra, raiz->esq->palavra) < 0)
        return rotacaoDireita(raiz);
    if (balanco < -1 && strcmp(palavra, raiz->dir->palavra) > 0)
        return rotacaoEsquerda(raiz);
    if (balanco > 1 && strcmp(palavra, raiz->esq->palavra) > 0) {
        raiz->esq = rotacaoEsquerda(raiz->esq);
        return rotacaoDireita(raiz);
    }
    if (balanco < -1 && strcmp(palavra, raiz->dir->palavra) < 0) {
        raiz->dir = rotacaoDireita(raiz->dir);
        return rotacaoEsquerda(raiz);
    }
    return raiz;
}

No* buscarPrimeiroPrefixo(No *raiz, char *prefixo) {
    No *achado = NULL;
    int tam = strlen(prefixo);

    while (raiz != NULL) {
        int cmp = strncmp(prefixo, raiz->palavra, tam);
        if (cmp == 0) {
            achado = raiz;
            raiz = raiz->esq;
        } else if (cmp < 0) {
            raiz = raiz->esq;
        } else {
            raiz = raiz->dir;
        }
    }
    return achado;
}

int listarPrefixoRec(No *raiz, char *prefixo, int tam) {
    if (raiz == NULL) return 0;

    int cmp = strncmp(raiz->palavra, prefixo, tam);
    int total = 0;

    if (cmp >= 0)
        total += listarPrefixoRec(raiz->esq, prefixo, tam);
    if (cmp == 0) {
        printf("  %s\n", raiz->palavra);
        total++;
    }
    if (cmp <= 0)
        total += listarPrefixoRec(raiz->dir, prefixo, tam);

    return total;
}

int listarPrefixoEmOrdem(No *raiz, char *prefixo) {
    int tam = strlen(prefixo);
    if (tam == 0) return 0;
    return listarPrefixoRec(raiz, prefixo, tam);
}

void carregarVocabulario(No **raiz, char *palavras[], int n) {
    char buffer[256];
    int i;
    for (i = 0; i < n; i++) {
        if (palavraValida(palavras[i])) {
            strcpy(buffer, palavras[i]);
            paraMinusculas(buffer);
            *raiz = inserir(*raiz, buffer);
        }
    }
}

int carregarVocabularioDeArquivo(No **raiz, char *nomeArquivo) {
    FILE *fp = fopen(nomeArquivo, "r");
    if (fp == NULL) return -1;

    char buffer[256];
    int inseridas = 0;
    while (fgets(buffer, 256, fp) != NULL) {
        int tam = strlen(buffer);
        if (tam > 0 && buffer[tam-1] == '\n') buffer[tam-1] = '\0';
        if (!palavraValida(buffer)) continue;
        paraMinusculas(buffer);
        *raiz = inserir(*raiz, buffer);
        inseridas++;
    }
    fclose(fp);
    return inseridas;
}

void liberarArvore(No *raiz) {
    if (raiz == NULL) return;
    liberarArvore(raiz->esq);
    liberarArvore(raiz->dir);
    free(raiz->palavra);
    free(raiz);
}

int palavraValida(char *s) {
    if (s == NULL || s[0] == '\0') return 0;
    int i;
    for (i = 0; s[i] != '\0'; i++) {
        if (!isalnum(s[i])) return 0;
    }
    return 1;
}

void paraMinusculas(char *s) {
    int i;
    for (i = 0; s[i] != '\0'; i++) {
        s[i] = tolower(s[i]);
    }
}
