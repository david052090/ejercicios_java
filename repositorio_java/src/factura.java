import java.util.Scanner;

public class factura {
    public static Scanner ingresoTeclado;
    public static String[] nameProducto;
    public static int[] unidades;
    public static Double[] precioUnidad;

    public static void main(String[] args) {
        ingresoTeclado = new Scanner(System.in);
        System.out.println("ingrese el numero de productos a comprar");
        int tmp = ingresoTeclado.nextInt();
        nameProducto = new String[tmp];
        unidades = new int[tmp];
        precioUnidad = new Double[tmp];
        for (int i = 0; i < tmp; i++) {
            System.out.println("ingrese el nombre del producto");
            nameProducto[i] = ingresoTeclado.next();
            System.out.println("ingrese la cantidad");
            unidades[i] = ingresoTeclado.nextInt();
            System.out.println("ingrese el precio");
            precioUnidad[i] = ingresoTeclado.nextDouble();
        }
        System.out.println("  ");
        System.out.println("__________________________________________________");
        System.out.println("Producto - unidades - precio/unidad--- total ");
        Double total = 0.0;
        for (int j = 0; j < tmp; j++) {
            System.out.println( + nameProducto[j]+ + unidades[j] +  + precioUnidad[j]+
            total=total+(unidades[j]*precioUnidad[j]));
        }
        System.out.print("Total de productos "+total);
    }

}