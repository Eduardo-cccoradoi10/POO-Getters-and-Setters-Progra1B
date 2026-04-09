package Introduccion;

public class Contacto {
    private String nombre;
    private String telefono;
    private String email;

    // Constructor
    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        setTelefono(telefono);
        setEmail(email);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono.length() == 8 && telefono.matches("\\d+")) {
            this.telefono = telefono;
        } else {
            System.out.println("Teléfono inválido. Debe tener exactamente 8 dígitos.");
            this.telefono = "00000000";
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Email inválido. Debe contener '@'.");
            this.email = "sin-email@desconocido.com";
        }
    }

    // Método para mostrar el contacto
    public void mostrarContacto() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Email: " + email);
    }
}
