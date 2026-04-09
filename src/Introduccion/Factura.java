package Introduccion;

public class Factura {
    private String codigoFactura;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    // Constructor
    public Factura(String codigoFactura, String descripcion, int cantidad, double precioUnitario) {
        this.codigoFactura = codigoFactura;
        this.descripcion = descripcion;
        setCantidad(cantidad);
        setPrecioUnitario(precioUnitario);
    }

    // Getters y Setters
    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad inválida. Debe ser mayor a 0. Se asignará 1.");
            this.cantidad = 1;
        } else {
            this.cantidad = cantidad;
        }
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario <= 0) {
            System.out.println("Precio unitario inválido. Debe ser mayor a 0. Se asignará 1.");
            this.precioUnitario = 1;
        } else {
            this.precioUnitario = precioUnitario;
        }
    }

    // Método para calcular el total
    public double calcularTotal() {
        return cantidad * precioUnitario;
    }

    // Mostrar factura
    public void mostrarFactura() {
        System.out.println("Código: " + codigoFactura);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Unitario: Q" + precioUnitario);
        System.out.println("Total: Q" + calcularTotal());
    }
}
