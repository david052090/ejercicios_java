import java.util.Scanner;

public class arreglos {
    public static Scanner ingresoTeclado;
    public static String[] texto;
    public static String letra, textotmp;

    public static void main(String[] args) {
        ingresoTeclado = new Scanner(System.in);
        System.out.println("ingrese el texto");
        textotmp = ingresoTeclado.nextLine();
        texto = new String[textotmp.length()];
        for (int i = 0; i < textotmp.length(); i++) {
            texto[i] = textotmp.substring(i, i + 1);
            System.out.println("esto es lo que estoy guardando " + texto[i].toString());

        }
        System.out.println("ingrese por favor la letra");
        letra = ingresoTeclado.next();
        int contador = 0;
        for (int j = 0; j < texto.length; j++) {
            if (texto[j].toString().equals(letra)) {
                contador++;
            }

        }
        System.out.print("el numero de veces que se presenta la letra " + letra + " es " + contador);
    }
}
