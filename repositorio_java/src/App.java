
import java.util.Scanner;

public class App {
    public static Scanner ingresoTeclado;
    public static Double[] notas;

    public static void main(String[] args) throws Exception {
        ingresoTeclado = new Scanner(System.in);
        notas = new Double[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese las notas");
            notas[i] = ingresoTeclado.nextDouble();

        }
        for (int j = 0; j < 5; j++) {
            System.out.println("Esta es la nota de la posición " + j + " y su nota es " + notas[j]);

        }

    }
}
