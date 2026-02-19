package ADMINISTRADOR_DE_NOTAS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorAlumnos gestor = new GestorAlumnos();
        int opcion;

        do {
            System.out.println("1. Añadir alumno");
            System.out.println("2. Añadir nota");
            System.out.println("3. Mostrar alumnos");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    sc.nextLine();
                    String nombre = sc.nextLine();
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    gestor.añadirAlumno(new Alumno(nombre, id));
                    break;

                case 2:
                    System.out.print("ID del alumno: ");
                    int idAlumno = sc.nextInt();
                    Alumno alumno = gestor.buscarAlumno(idAlumno);
                    if (alumno != null) {
                        System.out.print("Nota: ");
                        double nota = sc.nextDouble();
                        alumno.añadirNota(nota);
                    } else {
                        System.out.println("Alumno no encontrado");
                    }
                    break;

                case 3:
                    gestor.mostrarAlumnos();
                    break;
            }
        } while (opcion != 0);

        sc.close();
    }
}

