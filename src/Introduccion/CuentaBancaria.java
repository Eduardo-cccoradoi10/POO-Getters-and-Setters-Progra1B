package Introduccion;

public class CuentaBancaria {
    private String titular;
    private double saldo;
    private int pin;

    // Constructor
    public CuentaBancaria(String titular, double saldo, int pin) {
        this.titular = titular;
        this.saldo = saldo;
        this.pin = pin;
    }

    public CuentaBancaria(String titular2, int saldo2, int pin2) {
		// TODO Auto-generated constructor stub
	}

	// Getters (no damos setter de PIN por seguridad)
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método retirar con validación de PIN
    public void retirar(double monto, int pinIngresado) {
        if (pinIngresado != pin) {
            System.out.println("PIN incorrecto. Operación denegada.");
            return;
        }

        if (monto <= 0) {
            System.out.println("El monto debe ser mayor a 0.");
            return;
        }

        if (monto > saldo) {
            System.out.println("Fondos insuficientes. Saldo disponible: " + saldo);
        } else {
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        }
    }

    public void mostrar() {
        System.out.println("Titular: " + titular + ", Saldo: " + saldo);
    }
}
