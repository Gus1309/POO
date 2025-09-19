import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String titulo;
    private int cupo;
    private final List<Estudiante> estudiantes;
    private Profesor profesor;

    public Curso(String titulo, int cupo) {
        this.titulo = titulo;
        this.cupo = cupo;
        this.estudiantes = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getCupo() {
        return cupo;
    }
    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void agregarEstudiante(Estudiante e) {
        if (estudiantes.size() < cupo) {
            estudiantes.add(e);
            System.out.println("Estudiante agregado al curso.");
        } else {
            System.out.println("No hay cupo disponible.");
        }
    }

    @Override
    public String toString() {
        return "Curso: " + titulo + ", Cupo: " + cupo + ", Estudiantes: " + estudiantes.size() + (profesor != null ? ", Profesor: " + profesor.getNombre() : "");
    }
}
