
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
/*
 * una universidad tiene dos turnos (manana y noche ) en los que trabajan 12
 * empleados 5 por la manana y 7 por la noche, crear un programa que permita
 * almacenar los datos de los sueldos de los empleados agrupados por turnos,
 * deben mostrar por pantalla los gastos de los sueldos de cada turno
 * 
 * Crear metodos para este ejercicio...
 */
