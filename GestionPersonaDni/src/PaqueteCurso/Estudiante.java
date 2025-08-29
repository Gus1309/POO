package PaqueteCurso;

public class Estudiante {
    private String nombre;
    private int legajo;

    public Estudiante(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public Estudiante() {
        this.nombre = "";
        this.legajo = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre: '" + nombre + '\'' +
                ", legajo: " + legajo + '\n';
    }
}
