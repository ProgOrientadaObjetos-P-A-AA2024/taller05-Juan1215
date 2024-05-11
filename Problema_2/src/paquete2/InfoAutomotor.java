package paquete2;

public class InfoAutomotor {

    private String cedula;
    private String marcaVehiculo;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public InfoAutomotor(String ced, String marc, int anio, double val) {

        cedula = ced;
        marcaVehiculo = marc;
        anioFabricacion = anio;
        valorVehiculo = val;

    }

    public InfoAutomotor(String ced, String marc, int anio) {

        cedula = ced;
        marcaVehiculo = marc;
        anioFabricacion = anio;
        valorVehiculo = 40000;

    }

    public void establecerCedula(String s) {
        cedula = s;
    }

    public void establecerMarcaVehiculo(String s) {
        marcaVehiculo = s;
    }

    public void establecerAnioFabricacion(int s) {
        anioFabricacion = s;
    }

    public void establecerValorVehiculo(double s) {
        valorVehiculo = s;
    }

    public void calcularValorMatricula() {
        valorMatricula = (0.00002 * valorVehiculo) * (2024 - anioFabricacion);
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarcaVehiculo() {
        return marcaVehiculo;
    }

    public int obtenerAnioFabricacion() {
        return anioFabricacion;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {

        String cadena = String.format("Informacion de Automotor"
                + "Cedula: %s\n"
                + "Marca Del Vehiculo: %s\n"
                + "Anio De Fabricacion: %d\n"
                + "Valor Del Vehiculo: %.3f\n"
                + "Valor de Matricula: %.3f\n",
                cedula,
                marcaVehiculo,
                anioFabricacion,
                valorVehiculo,
                valorMatricula);
        return cadena;
    }
}
