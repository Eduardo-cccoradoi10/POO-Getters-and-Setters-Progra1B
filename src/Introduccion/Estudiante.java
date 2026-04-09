package Introduccion;

public class Estudiante {
    private String carnet;
    private String nombre;
    private double promedio;

    // Constructor
    public Estudiante(String carnet, String nombre, double promedio) {
        this.carnet = carnet;
        this.nombre = nombre;
        setPromedio(promedio); // usa validación
    }

    // Getters y Setters
    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if (promedio < 0 || promedio > 100) {
            System.out.println("Promedio inválido. Se asignará 0.");
            this.promedio = 0;
        } else {
            this.promedio = promedio;
        }
    }

    // Método esBecado
    public boolean esBecado() {
        return promedio >= 85;
    }

    public void mostrar() {
        System.out.println("Carnet: " + carnet);
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + promedio);
        System.out.println("¿Becado?: " + (esBecado() ? "Sí" : "No"));
    }
}
