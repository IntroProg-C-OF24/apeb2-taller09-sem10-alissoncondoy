package problema_1;
import java.util.Scanner;
public class Problema_3 {
    public static void main(String[] args) {
      double[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int promedioT = 13, arriba= 0, abajo= 0;
        double mediaAritmetica;
        
        int suma = 0;
        for (int i = 0; i < promedioT; i++) {
            suma += arreglo[i];
        }
        for (int i = 0; i < promedioT; i++) {
            mediaAritmetica = suma / promedioT;
            if (arreglo[i] > mediaAritmetica) {
                System.out.println("Se encuentra por arriba de la media aritmetica: " + arreglo[i]);
                arriba += +1;
            } else { 
                System.out.println("Se encuentra por debajo de la media aritmetica : " + arreglo[i]);
                abajo += +1;
            }
        }
        System.out.println("Se encuentran :"+arriba+ " por encima de la media aritmetica y: "+abajo+" por debajo de la media aritmetica");
    }
}  

