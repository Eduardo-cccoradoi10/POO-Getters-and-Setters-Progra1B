package Introduccion;

public class Termometro {
    private double celsius;

    // Setter con validación del cero absoluto
    public void setCelsius(double temperatura) {
        if (temperatura < -273.15) {
            System.out.println("Error: la temperatura no puede ser menor a -273.15 °C (cero absoluto).");
            this.celsius = -273.15;
        } else {
            this.celsius = temperatura;
        }
    }

    // Getter normal
    public double getCelsius() {
        return celsius;
    }

    // Conversión a Fahrenheit
    public double getFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public void mostrar() {
        System.out.println("Temperatura: " + celsius + " °C / " + getFahrenheit() + " °F");
    }
}
