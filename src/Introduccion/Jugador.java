package Introduccion;

public class Jugador {
    private String nombre;
    private int puntajeActual;
    private int puntajeMaximo;

    // Constructor
    public Jugador(String nombre, int puntajeActual) {
        this.nombre = nombre;
        setPuntajeActual(puntajeActual);
        this.puntajeMaximo = puntajeActual; // el primer puntaje es el máximo inicial
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public int getPuntajeActual() {
        return puntajeActual;
    }

    public int getPuntajeMaximo() {
        return puntajeMaximo;
    }

    public void setPuntajeActual(int puntajeActual) {
        if (puntajeActual < 0) {
            System.out.println("El puntaje actual no puede ser negativo. Se asignará 0.");
            this.puntajeActual = 0;
        } else {
            this.puntajeActual = puntajeActual;
        }
    }

    // Método para actualizar puntaje
    public void actualizarPuntaje(int nuevoPuntaje) {
        if (nuevoPuntaje < 0) {
            System.out.println("El puntaje no puede ser negativo.");
            return;
        }

        this.puntajeActual = nuevoPuntaje;

        if (nuevoPuntaje > puntajeMaximo) {
            puntajeMaximo = nuevoPuntaje;
            System.out.println("¡Nuevo puntaje máximo alcanzado!");
        }
    }

    public void mostrar() {
        System.out.println("Jugador: " + nombre);
        System.out.println("Puntaje actual: " + puntajeActual);
        System.out.println("Puntaje máximo: " + puntajeMaximo);
    }
}
