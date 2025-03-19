package Aula2;

import java.util.Arrays;

public class QuickSortTime {

    public void getTime(int[] vetor) {
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
    }
