package Aula1;

public class Teste {

    public static void main(String[] args){
      Fila<Integer> fila = new Fila<Integer>();
        System.out.println("A fila esta vazia?" + fila.estaVazia());
        if(fila.espiar() == null){
            System.out.println("A fila esta vazia");
        }else {
            System.out.println("O primeiro elemento da fila é : " + fila.espiar());
        }
      fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);

        System.out.println("A fila esta vazia?" + fila.estaVazia());

        System.out.println("Qual o tamanho da fila ?" + fila.tamanho);

        System.out.println(fila.toString());
        if(fila.espiar() == null){
            System.out.println("A fila esta vazia");
        }else {
            System.out.println("O primeiro elemento da fila é : " + fila.espiar());
        }

        System.out.println(fila.desenfileirar());

        System.out.println(fila.toString());

    }
}

