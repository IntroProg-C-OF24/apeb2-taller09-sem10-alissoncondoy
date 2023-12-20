package problema_1;
import java.util.Scanner;
public class Problema_5 {
    public static void main(String[] args) {
        int limEst = 10;
        double notasEst[] = new double[limEst], sumaNotas = 0, promedio, mayor, menor;
        for (int i = 0; i < notasEst.length; i++) {
            notasEst[i] = (double) (Math.random() * (9 - 0 + 1) - 0);
        }
        System.out.println("LISTADO DE NOTAS");
        for (int i = 0; i < notasEst.length; i++) {
            System.out.printf("\nNota del estudiante %d: %.2f", (i + 1), notasEst[i]);
        }
        for (int i = 0; i < notasEst.length; i++) {
            sumaNotas += notasEst[i];
        }
        promedio = sumaNotas / notasEst.length;
        System.out.printf("\nPromedio: %.2f \n", promedio);
        mayor = notasEst[0];
        menor = notasEst[0];
        for (int i = 0; i < notasEst.length; i++) {
            if (notasEst[i] > mayor) {
                mayor = notasEst[i];
            }
            if (notasEst[i] < menor) {
                menor = notasEst[i];
            }
        }
        System.out.printf("Nota menor: %.2f \n", menor);
        System.out.printf("Nota mayor: %.2f \n", mayor);
        for (int i = 0; i < notasEst.length; i++) {
            if (notasEst[i] > promedio) {
                System.out.printf("NOTAS ENCIMA DEL PROMEDIO: %.2f \n", notasEst[i]);
            }
        }
    }
}
