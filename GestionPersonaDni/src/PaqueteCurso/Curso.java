package PaqueteCurso;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String denominacion;
    private String turno;
    private List<Estudiante> estudiantes; // relación 1 a muchos

    public Curso(String denominacion, String turno) {
        this.denominacion = denominacion;
        this.turno = turno;
        estudiantes = new ArrayList<>();
    }

    //getters y setters

    public String getTurno() {
        return turno;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    // otros métodos
    public void agregarEstudiante(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "denominacion='" + denominacion + '\'' +
                ", turno='" + turno + '\'' +
                ", estudiantes=" + estudiantes +
                '}';
    }
}

