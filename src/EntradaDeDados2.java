import javax.swing.*;
import java.util.*;

public class EntradaDeDados2 {

    public static void main(String[] args) {

        int[] numero = {100, 50, 25, 15, 10, 80, 5}; // antes de ordenar
        displayElement(numero);

        Arrays.sort(numero);
        displayElement(numero);
        /**
         * Método displayElement, ele é invocado toda vez que se
         * prentende imprimir os dados de um array.
         *Retorno vazio (void) Nome do Método Recebe um array de inteiro
         *como argumento.*/
    }
    public static void displayElement(int[] array){

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "");
        }
        System.out.println(""); // pula uma linha

/** essa e outra forma de perguntar ao usuario
        JOptionPane.showInputDialog("insira seu nome!: ");
Integer.parseInt(JOptionPane.showInputDialog("insira sua idade!! : "));
*/


    }

}