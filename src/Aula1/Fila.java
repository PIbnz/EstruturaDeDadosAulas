package Aula1;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila(){
        super();
    }

    public Fila(int cap){
        super(cap);
    }

    public void enfileirar(T elemento){
        this.adiciona(elemento);
    }

    public T espiar(){
        if(this.estaVazia()){
            return null;
        }
        return  this.elementos[0];
    }

    public T desenfileirar(){
        if(this.estaVazia()){
            return null;
        }
        final int POS = 0;

        T elemntoASerRemovido = this.elementos[POS];
        this.remove(POS);
        return elemntoASerRemovido;
    }
}
