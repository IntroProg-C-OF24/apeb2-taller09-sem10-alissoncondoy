package problema_1;
import java.util.Scanner;
public class Problema_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese cuantas marcas de vehiculo desea ingresar:");
        int limMarcas = teclado.nextInt();
        String[] marcas = new String[limMarcas];
        for (int i = 0; i < limMarcas; i++) {
            System.out.println("Ingrese el nombre de la marca: " + (i + 1));
            marcas[i] = teclado.next();

            if (marcas[i].startsWith("C") || marcas[i].startsWith("A") || marcas[i].startsWith("T")) {
                System.out.println("==NO SE ACEPTAN MARCAS QUE INICIEN CON C, A, O T==");
                i--;
            }
        }
    }
}
    
      
