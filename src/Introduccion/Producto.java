package Introduccion;

public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    // Constructor
    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        setPrecio(precio); // usa validación
        setStock(stock);   // usa validación
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio <= 0) {
            System.out.println("Error: el precio debe ser mayor a 0. Se asignará 1.");
            this.precio = 1;
        } else {
            this.precio = precio;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            System.out.println("Error: el stock no puede ser negativo. Se asignará 0.");
            this.stock = 0;
        } else {
            this.stock = stock;
        }
    }

    // Método vender
    public void vender(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a vender debe ser mayor a 0.");
            return;
        }

        if (cantidad > stock) {
            System.out.println("No hay suficiente stock. Disponible: " + stock);
        } else {
            stock -= cantidad;
            System.out.println("Venta realizada. Stock restante: " + stock);
        }
    }

    public void mostrar() {
        System.out.println("Código: " + codigo + ", Nombre: " + nombre +
                           ", Precio: Q" + precio + ", Stock: " + stock);
    }
}
