package paquete1;

import java.util.Scanner;
import paquete2.LibretaNotas;

public class Ejecutor {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        boolean bandera = true;
        while (bandera) {
            System.out.println("|==== MENU: ===|");
            System.out.println(" 1.- Crear objeto Estudiante (2 calificaciones)");
            System.out.println(" 2.- Crear objeto Estudiante (3 calificaciones)");
            System.out.println(" 3.- Salir");
            System.out.println("============");
            System.out.print("Ingrese una opcion: ");
            int opcion = leer.nextInt();

            if (opcion == 1) {
                System.out.println();
                System.out.print("Ingrese nombre del estudiante: ");
                String nombre = leer.next();
                System.out.print("Ingrese calificacion de la materia 1: ");
                double calificacion1 = leer.nextDouble();
                System.out.print("Ingrese calificacion de la materia 2: ");
                double calificacion2 = leer.nextDouble();

                LibretaNotas notas = new LibretaNotas(nombre, calificacion1,
                        calificacion2);
                notas.calcularPromedio();

                System.out.printf("%s", notas);
            } else if (opcion == 2) {
                System.out.println();
                System.out.print("Ingrese nombre del estudiante: ");
                String nombre = leer.next();
                System.out.print("Ingrese calificacion de la materia 1: ");
                double calificacion1 = leer.nextDouble();
                System.out.print("Ingrese calificacion de la materia 2: ");
                double calificacion2 = leer.nextDouble();
                System.out.print("Ingrese calificacion de la materia 3: ");
                double calificacion3 = leer.nextDouble();

                LibretaNotas notas = new LibretaNotas(nombre, calificacion1,
                        calificacion2, calificacion3);
                notas.calcularPromedio();

                System.out.printf("%s\n", notas);
            } else if (opcion == 3) {
                System.out.println("Fuera del programa");
                bandera = false;
            } else {
                System.out.println("Ingrese una opcion valida ");
            }
        }
    }
}
