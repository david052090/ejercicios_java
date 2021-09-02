import java.util.Scanner;

public class contador {
    public static Scanner ingresoTeclado;
    public static String txto, palabra;

    public static void main(String[] args) {
        ingresoTeclado = new Scanner(System.in);
        System.out.println("ingrese el texto");
        txto = ingresoTeclado.nextLine();
        System.out.println("ingrese la palabra");
        palabra = ingresoTeclado.next();
        int contador = 0;
        for (int i = 0; i < txto.length(); i++) {
            if (txto.charAt(i) == palabra.charAt(0)) {
                contador++;
            }

        }
        System.out.println("la letra " + palabra.charAt(0) + " aparece " + contador + " veces");
    }
}
