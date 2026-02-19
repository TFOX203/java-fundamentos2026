package ADMINISTRADOR_DE_NOTAS;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private int id;
    private ArrayList<Double> notas;

    public Alumno(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.notas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void añadirNota(double nota) {
        notas.add(nota);
    }

    public double calcularMedia() {
        if (notas.isEmpty()) return 0;
        double suma = 0;
        for (double n : notas) {
            suma += n;
        }
        return suma / notas.size();
    }

    public void mostrarAlumno() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Notas: " + notas);
        System.out.println("Media: " + calcularMedia());
        System.out.println("------------------------");
    }
}

