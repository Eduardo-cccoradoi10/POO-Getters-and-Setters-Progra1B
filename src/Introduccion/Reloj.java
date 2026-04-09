package Introduccion;

public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;

    // Setters con validación
    public void setHora(int hora) {
        if (hora < 0 || hora > 23) {
            System.out.println("Hora inválida. Se asignará 0.");
            this.hora = 0;
        } else {
            this.hora = hora;
        }
    }

    public void setMinuto(int minuto) {
        if (minuto < 0 || minuto > 59) {
            System.out.println("Minuto inválido. Se asignará 0.");
            this.minuto = 0;
        } else {
            this.minuto = minuto;
        }
    }

    public void setSegundo(int segundo) {
        if (segundo < 0 || segundo > 59) {
            System.out.println("Segundo inválido. Se asignará 0.");
            this.segundo = 0;
        } else {
            this.segundo = segundo;
        }
    }

    // Getters
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    // Método para mostrar la hora en formato HH:MM:SS
    public String mostrarHora() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public void mostrar() {
        System.out.println("Hora actual: " + mostrarHora());
    }
}
