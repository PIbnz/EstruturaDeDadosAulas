package Aula2;

public class BubbleSortTime {
    public void getTime(int[] vetor) {
        long inicio = System.currentTimeMillis();
        int aux = 0;
        for (int cont = 0; cont < vetor.length; cont++) {
            for (int cont2 = 0; cont2 < vetor.length; cont2++) {
                if(vetor[cont] < vetor[cont2]){
                    aux = vetor[cont2];
                    vetor[cont2] = vetor[cont];
                    vetor[cont] = aux;
                }
            }
        }
        long fim = System.currentTimeMillis();
        System.out.println("Fim BubbleSort: "+(fim-inicio));
    }
}
