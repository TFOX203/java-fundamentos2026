package ADMINISTRADOR_DE_NOTAS;

import java.util.ArrayList;

public class GestorAlumnos {
    private ArrayList<Alumno> alumnos;

    public GestorAlumnos() {
        alumnos = new ArrayList<>();
    }

    public void añadirAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public Alumno buscarAlumno(int id) {
        for (Alumno a : alumnos) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    public void mostrarAlumnos() {
        for (Alumno a : alumnos) {
            a.mostrarAlumno();
        }
    }
}

