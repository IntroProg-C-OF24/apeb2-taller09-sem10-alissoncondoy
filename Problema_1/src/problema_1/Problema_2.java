package problema_1;
import java.util.Scanner;
public class Problema_2 {
    public static void main(String[] args) {
        String[] promCuali = new String[7];
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", "Teresa Martinez",
            "Julia Johnson", "Mark Cook", "Jennifer Manning",
            "Juan Vasquez"};
        for (int i = 0; i < promCuali.length; i++) {
            if (promedios[i] > 9) {
                System.out.println(estudiantes[i] + " promedio: " + promedios[i] + " promedio sobresaliente");
            } else if (promedios[i] < 9 && promedios[i] > 6) {
                System.out.println(estudiantes[i] + " promedio: " + promedios[i] + " promedio bueno");
            } else if (promedios[i] < 6) {
                System.out.println(estudiantes[i] + " promedio: " + promedios[i] + " promedio regular");
            }
        }
    }
}
    