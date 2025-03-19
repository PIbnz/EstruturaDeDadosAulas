package Aula2;

public class SelectionSortTime {
    public void getTime(int[] vetor) {
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < vetor.length-1; i++) {
            int menor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }
            int aux = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = aux;
        }
        long fim = System.currentTimeMillis();
        System.out.println("Fim SelectionSort: "+(fim-inicio));
    }

}
