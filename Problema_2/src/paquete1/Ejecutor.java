package paquete1;

import java.util.Scanner;
import paquete2.InfoAutomotor;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int anio, i = 0, numVehiculos;
        String cadenaFinal, cedula, marca;
        double valor;

        cadenaFinal = "";

        System.out.print(" Numero de Vehiculos: ");
        numVehiculos = leer.nextInt();

        while (i < numVehiculos) {

            leer.nextLine();

            System.out.print("Numero De Cedula: ");
            cedula = leer.nextLine();
            System.out.print("Marca Del Vehiculo: ");
            marca = leer.nextLine();
            System.out.print("Anio de Fabricacion: ");
            anio = leer.nextInt();
            System.out.print("Valor Del Vehiculo: ");
            valor = leer.nextInt();

            InfoAutomotor auto = new InfoAutomotor(cedula, marca,
                    anio, valor);

            auto.calcularValorMatricula();

            cadenaFinal = String.format("%s \nValor de Matricula"
                    + "Cedula: %s\n"
                    + "Marca Del Vehiculo: %s\n"
                    + "Anio De Fabricacion: %d\n"
                    + "Valor Del Vehiculo: %.3f\n"
                    + "Valor matricula: %.2f\n",
                    cadenaFinal,
                    auto.obtenerCedula(),
                    auto.obtenerMarcaVehiculo(),
                    auto.obtenerAnioFabricacion(),
                    auto.obtenerValorVehiculo(),
                    auto.obtenerValorMatricula());

            i++;
        }
        System.out.printf("%s\n", cadenaFinal);
    }
}
