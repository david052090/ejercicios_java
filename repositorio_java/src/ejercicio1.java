
import java.util.Scanner;

public class ejercicio1 {
    public static int numero1, numero2, resultado;
    public static Scanner ingresoTeclado;
    public static String nombreUsuario;

    public static void main(String[] args) throws Exception {
        ingresoTeclado = new Scanner(System.in);
        nombreUsuario = solicitarDatoTexto("ingrese su nombre");
        numero1 = solicitarDato("ingrese el primer numero");
        numero2 = solicitarDato("ingrese el segundo numero");
        sumaVariables(numero1, numero2, nombreUsuario);
        restaVariables(numero1, numero2, nombreUsuario);
        multiplicarVariables(numero1, numero2, nombreUsuario);
        dividirVariables(numero1, numero2, nombreUsuario);

    }

    public static String solicitarDatoTexto(String message) {
        System.out.println(message);
        return ingresoTeclado.nextLine();

    }

    public static int solicitarDato(String message) {
        System.out.println(message);
        return ingresoTeclado.nextInt();

    }

    public static void sumaVariables(int dato1, int dato2, String nameUser) {
        System.out.println(nameUser + " la sumatoria de los dos es " + (dato1 + dato2));

    }

    public static void restaVariables(int dato1, int dato2, String nameUser) {
        System.out.println(nameUser + " la resta de los dos es " + (dato1 - dato2));

    }

    public static void multiplicarVariables(int dato1, int dato2, String nameUser) {
        System.out.println(nameUser + " la multiplicacion de los dos es " + (dato1 * dato2));

    }

    public static void dividirVariables(int dato1, int dato2, String nameUser) {
        System.out.println(nameUser + " la division de los dos es " + (dato1 / dato2));

    }
}
