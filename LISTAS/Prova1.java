import java.awt.font.FontRenderContext;
import java.util.Scanner;

public class Prova1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanho = (int) (Math.random() * (20 - 5 + 1)) + 5;
        int contador = 0;
        int aux, prox, atual;

        System.out.print("\nVetor V com o tamanho de: " + tamanho);
        int[] v = new int[tamanho];

        System.out.print("\nElementos do vetor V: ");
        for (int i = 0; i < v.length; ) {

            v[i] = (int) (Math.random() * (73 - 42 + 1)) + 42;

            contador = 0;

            for (int j = 0; j < i; j++) {

                if (v[i] == v[j]) {
                    contador++;

                }
            }
            if (contador == 0) {
                System.out.println(v[i] + " ");
                i++;
            }
        }
        System.out.println("\n");

        // ORDENAR

        for (int i = 0; i < v.length - 1; i++){


            for (int j = 0; j < v.length - i; j++){

                atual = 0;
                for (int a = 0; a <= v[j]; a++){
                    if (v[j] % a == 0){
                        atual++;
                    }
                }
                prox = 0;
                for (int p = 0; p <= v[j + 1]; p++){
                    if (v[j + 1] %p == 0){
                        prox++;
                    }
                }

                if(atual != 2 && prox != 2 && v[j] > v[j + 1]){

                    aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;

                }
            }
        }
        System.out.print("\nVetor ordenado: ");
        for (int i = 0; i < v.length; i++){
            System.out.println(v[i] + " ");
        }
    }
}
