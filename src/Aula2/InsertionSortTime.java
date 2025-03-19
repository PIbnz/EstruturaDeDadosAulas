package Aula2;

public class InsertionSortTime {
    public void getTime(int[] vetor){
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
}
