#define MAX 500

struct elemento{
	struct NO *dados;
	struct elemento *prox;
};

typedef struct elemento Elem;

struct fila{
	struct elemento *inicio;
	struct elemento *final;
	int qtd;
};

typedef struct fila Fila;

Fila* cria_Fila();
void libera_Fila(Fila* fi);
int Fila_vazia(Fila* fi);
int Fila_cheia(Fila* fi);
int insere_Fila(Fila* fi,  struct NO *al);
int insere_inicio_Fila(Fila* fi, struct NO *al);

int remove_Fila(Fila* fi);
int consulta_Fila(Fila* fi, struct NO **al);

