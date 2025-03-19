package Aula2;

import java.util.Arrays;

public class MetodosOrdenacao {

    public static void main(String[] args) {
        int[] vetor = new int[100000];
        for (int cont = 0; cont < vetor.length; cont++) {
            vetor[cont] = (int) (Math.random()* vetor.length);
        }

        AllinOne allinOne = new AllinOne();

        allinOne.getTimeBubble(vetor);
        allinOne.getTimeInsert(vetor);
        allinOne.getTimeQck(vetor);
        allinOne.getTimeSelection(vetor);
    }

    public static void ordenarBub(int[] vetor){
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
    }

    public static void ordenarSel(int[] vet){
        int n = vet.length;


        for (int i = 0; i < n-1; i++) {
            int menor = i;
            for (int j = i+1; j < n; j++) {
                if(vet[j] < vet[menor]){
                    menor = j;
                }
            }
            int aux = vet[i];
            vet[i] = vet[menor];
            vet[menor] = aux;
        }
    }

    public static void ordenarIns(int[] vetor){
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
    }

    public static void ordenarQck(int[] vetor,int esquerda, int direita){
        if(esquerda<direita){
            int p = particao(vetor,esquerda,direita);
            ordenarQck(vetor,esquerda,p);
            ordenarQck(vetor,p+1,direita);
        }
    }

    public static int particao(int[] vetor , int esquerda,int direita){
        int meio = (int) (esquerda+direita) / 2;
        int pivo = vetor[meio];
        int i = esquerda -1;
        int j = direita + 1;

        while (true){
            do {
                i++;
            }while (vetor[i]<pivo);
            do {
                j--;
            }while (vetor[j] > pivo);
            if(i>=j){
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
    }



}
