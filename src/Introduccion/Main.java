package Introduccion;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== 1. PERSONA =====");
        PersonaEncapsulada persona = new PersonaEncapsulada("Carlos", "López", -5);
        persona.mostrar();

        System.out.println("\n===== 2. PRODUCTO =====");
        Producto producto = new Producto("A01", "Laptop", 5500, 10);
        producto.mostrar();
        producto.vender(3);
        producto.vender(20);

        System.out.println("\n===== 3. CUENTA BANCARIA =====");
        CuentaBancaria cuenta = new CuentaBancaria("Carlos López", 1000, 1234);
        cuenta.mostrar();
        cuenta.retirar(200, 1234); // correcto
        cuenta.retirar(100, 9999); // incorrecto

        System.out.println("\n===== 4. CURSO =====");
        Curso curso = new Curso("Programación I", 80, 70, 90);
        curso.mostrar();

        System.out.println("\n===== 5. ESTUDIANTE =====");
        Estudiante estudiante = new Estudiante("2024001", "Carlos López", 90);
        estudiante.mostrar();

        System.out.println("\n===== 6. TERMÓMETRO =====");
        Termometro termometro = new Termometro();
        termometro.setCelsius(25);
        termometro.mostrar();
        termometro.setCelsius(-300); // inválido
        termometro.mostrar();

        System.out.println("\n===== 7. RELOJ =====");
        Reloj reloj = new Reloj();
        reloj.setHora(14);
        reloj.setMinuto(30);
        reloj.setSegundo(45);
        reloj.mostrar();
        reloj.setHora(30); // inválido
        reloj.setMinuto(80); // inválido
        reloj.setSegundo(-5); // inválido
        reloj.mostrar();

        System.out.println("\n===== 8. CONTACTO =====");
        Contacto contacto = new Contacto("Carlos López", "12345678", "carlos@gmail.com");
        contacto.mostrarContacto();
        Contacto contacto2 = new Contacto("Ana Pérez", "12A45", "correo_invalido");
        contacto2.mostrarContacto();

        System.out.println("\n===== 9. JUGADOR =====");
        Jugador jugador = new Jugador("Carlos", 50);
        jugador.mostrar();
        jugador.actualizarPuntaje(80);
        jugador.actualizarPuntaje(40);
        jugador.actualizarPuntaje(-10);

        System.out.println("\n===== 10. FACTURA =====");
        Factura factura = new Factura("F001", "Mouse inalámbrico", 3, 85.50);
        factura.mostrarFactura();
        Factura factura2 = new Factura("F002", "Teclado mecánico", -2, -150);
        factura2.mostrarFactura();

        System.out.println("\n===== FIN DE PRUEBAS =====");
    }
}
