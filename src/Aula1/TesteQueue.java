package Aula1;

import java.util.LinkedList;
import java.util.Queue;

public class TesteQueue {

    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<Integer>();

        fila.add(1);
        fila.add(2);
        fila.add(3);

        System.out.println(fila.toString());

        System.out.println(fila.remove());

        System.out.println(fila.toString());
    }
}
