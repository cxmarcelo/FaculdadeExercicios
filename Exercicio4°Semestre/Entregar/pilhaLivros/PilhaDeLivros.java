package pilhaLivros;

public class PilhaDeLivros {

    private Livro[] pilha;
    private int posicaoPilha;
 
    public PilhaDeLivros() {
        this.posicaoPilha = -1;
        this.pilha = new Livro[100];
    }
 
    public boolean isEmpty() {
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }
 
    public int size() {
        if (this.isEmpty()) {
            return 0;
        }
        return this.posicaoPilha + 1;
    }
 
    public Object exibeUltimoValor() {
        if (this.isEmpty()) {
            return null;
        }
        return this.pilha[this.posicaoPilha];
    }
 
    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        return this.pilha[this.posicaoPilha--];
    }
 
    public void push(Livro valor) {
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = valor;
        }
    }
}