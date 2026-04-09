package Introduccion;

public class Curso {
    private String nombreCurso;
    private double nota1;
    private double nota2;
    private double nota3;

    // Constructor
    public Curso(String nombreCurso, double nota1, double nota2, double nota3) {
        this.nombreCurso = nombreCurso;
        setNota1(nota1);
        setNota2(nota2);
        setNota3(nota3);
    }

    // Getters y Setters con validación
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if (nota1 < 0 || nota1 > 100) {
            System.out.println("Nota 1 inválida. Se asignará 0.");
            this.nota1 = 0;
        } else {
            this.nota1 = nota1;
        }
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if (nota2 < 0 || nota2 > 100) {
            System.out.println("Nota 2 inválida. Se asignará 0.");
            this.nota2 = 0;
        } else {
            this.nota2 = nota2;
        }
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        if (nota3 < 0 || nota3 > 100) {
            System.out.println("Nota 3 inválida. Se asignará 0.");
            this.nota3 = 0;
        } else {
            this.nota3 = nota3;
        }
    }

    // Método promedio
    public double promedio() {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Método estado
    public String estado() {
        return promedio() >= 61 ? "Aprobado" : "Reprobado";
    }

    public void mostrar() {
        System.out.println("Curso: " + nombreCurso);
        System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
        System.out.println("Promedio: " + promedio());
        System.out.println("Estado: " + estado());
    }
}
