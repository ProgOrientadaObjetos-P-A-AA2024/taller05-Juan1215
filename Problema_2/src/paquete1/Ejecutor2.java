package paquete1;

import java.util.Scanner;
import paquete2.InfoAutomotor;

public class Ejecutor2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String cedula, marca, opcion, cadenaFinal;

        int anio;
        double valor;

        cadenaFinal = "";

        boolean bandera = true;

        while (bandera) {

            System.out.print("Numero De Cedula: ");
            cedula = leer.nextLine();
            System.out.print(" Marca Del Vehiculo: ");
            marca = leer.nextLine();
            System.out.print(" Anio Del Fabricante: ");
            anio = leer.nextInt();
            System.out.print(" Valor Del Vehiculo: ");
            valor = leer.nextDouble();

            InfoAutomotor autos = new InfoAutomotor(cedula, marca,
                    anio, valor);

            autos.calcularValorMatricula();

            cadenaFinal = String.format("Valor de la matricula"
                    + "Cedula: %s\n"
                    + "Marca Del Vehiculo: %s\n"
                    + "Anio De Fabricacion: %d\n"
                    + "Valor Del Vehiculo: %.3f\n"
                    + "Valor de la matricula: %.2f\n",
                    autos.obtenerCedula(),
                    autos.obtenerMarcaVehiculo(),
                    autos.obtenerAnioFabricacion(),
                    autos.obtenerValorVehiculo(),
                    autos.obtenerValorMatricula());

            leer.nextLine();

            System.out.println("Desea ingresar más vendedores. Ingrese n para"
                    + " salir");
            opcion = leer.nextLine();
            if (opcion.equals("n")) {
                bandera = false;
            }
        }
        System.out.printf("%s", cadenaFinal);
    }
}
