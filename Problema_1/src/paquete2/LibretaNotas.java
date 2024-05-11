package paquete2;

public class LibretaNotas {

    private String nombre;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public LibretaNotas(String n, double c1, double c2, double c3) {
        nombre = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = c3;
    }

    public LibretaNotas(String n, double c1, double c2) {
        nombre = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = (c1 + c2) / 2;
    }

    public void establecerNombreEstudiante(String s) {
        nombre = s;
    }

    public void establecerCalificacion1(double s) {
        calificacion1 = s;
    }

    public void establecerCalificacion2(double s) {
        calificacion2 = s;
    }

    public void establecerCalificacion3(double s) {
        calificacion3 = s;
    }

    public void calcularPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }

    public String obtenerNombreEstudiante() {
        return nombre;
    }

    public double obtenerCalificacion1() {
        return calificacion1;
    }

    public double obtenerCalificacion2() {
        return calificacion2;
    }

    public double obtenerCalificacion3() {
        return calificacion3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = String.format("\n\nLibreta de Calificaciones \n"
                + " Nombre del Estudiante: %s\n"
                + " Calificacion 1: %.2f\n"
                + " Calificacion 2: %.2f\n"
                + " Calificacion 3: %.2f\n"
                + " Promedio Final: %.3f\n",
                nombre,
                calificacion1,
                calificacion2,
                calificacion3,
                promedio);
        return cadena;
    }
}
