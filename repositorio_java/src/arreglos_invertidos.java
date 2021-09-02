import java.util.Scanner;

public class arreglos_invertidos {
    public static Scanner ingresoTeclado;

    public static void main(String[] args) {
        int[] numeros = new int[11];
        System.out.println("Estos son los numeros del arreglo en orden");
        for (int i = 0; i < 11; i++) {
            numeros[i] = i + 1;

            System.out.println(numeros[i]);
        }
        System.out.println("Estos son los numeros del arreglo en invertido");
        for (int i = 10; i < 11; i--) {
            numeros[i] = i + 1;

            System.out.println(numeros[i]);
        }
    }
}
