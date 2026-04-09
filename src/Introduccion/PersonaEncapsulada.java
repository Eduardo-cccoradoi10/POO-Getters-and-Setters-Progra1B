package Introduccion;

public class PersonaEncapsulada {
    private String nombre;
    private String apellido;
    private int edad;

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            System.out.println("La edad no puede ser negativa. Se asignará 0.");
            this.edad = 0;
        } else {
            this.edad = edad;
        }
    }

    // Constructor usando setters (buena práctica)
    public PersonaEncapsulada(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        setEdad(edad);// usa la validación
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + " " + apellido + ", Edad: " + edad);
    }
}
