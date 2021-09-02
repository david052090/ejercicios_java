import java.util.Scanner;

public class ejercicio_u {
    public static Scanner ingresoTeclado;
    public static Double[] turnoDia;
    public static Double[] turnoNoche;

    public static void main(String[] args) throws Exception {
        ingresoTeclado = new Scanner(System.in);
        System.out.println("El turno de la manana tiene 5 empleados");
        turnoDia = new Double[5];
        for (int d = 0; d < 5; d++) {
            System.out.println("Ingrese el sueldo de los empleados del dia");
            turnoDia[d] = ingresoTeclado.nextDouble();

        }
        turnoNoche = new Double[7];
        for (int n = 0; n < 7; n++) {
            System.out.println("Ingrese el sueldo de los empleados de la noche");
            turnoDia[n] = ingresoTeclado.nextDouble();

        }
        for (int j = 0; j < 5; j++) {
            System.out.println("los gastos del turno de dia " + j + " son: " + turnoDia[j]);

        }
        for (int j = 0; j < 7; j++) {
            System.out.println("los gastos del turno de dia " + j + " son: " + turnoNoche[j]);

        }

    }

}
