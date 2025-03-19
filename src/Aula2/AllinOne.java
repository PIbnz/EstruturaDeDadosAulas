package Aula2;

public class AllinOne {

    public void getTimeQck(int[] vetor){
        long inicio = System.currentTimeMillis();
        this.quickSort(vetor,0,vetor.length-1);
        long fim = System.currentTimeMillis();
        System.out.println("Fim QuickSort: "+(fim-inicio));
    }

    public void quickSort(int[] vetor, int esquerda, int direita) {
        if (esquerda < direita) {
            int p = particao(vetor, esquerda, direita);
            quickSort(vetor, esquerda, p);
            quickSort(vetor, p + 1, direita);
        }
    }

    public int particao ( int[] vetor, int esquerda, int direita){
        int meio = (int) (esquerda + direita) / 2;
        int pivo = vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;

        while (true) {
            do {
                i++;
            } while (vetor[i] < pivo);
            do {
                j--;
            } while (vetor[j] > pivo);
            if (i >= j) {
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
    }

    public void getTimeInsert(int[] vetor){
            long inicio = System.currentTimeMillis();
            int aux, j;
            for(int cont = 1;cont<vetor.length;cont++){
                aux = vetor[cont];
                j = cont-1;
                while (j >= 0 && vetor[j] > aux){
                    vetor[j+1] = vetor[j];
                    j--;
                }
                vetor[j+1] = aux;
            }
            long fim = System.currentTimeMillis();
            System.out.println("Fim InsertionSort: "+(fim-inicio));
    }

    public void getTimeBubble(int[] vetor){
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

    public void getTimeSelection(int[] vetor){
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
