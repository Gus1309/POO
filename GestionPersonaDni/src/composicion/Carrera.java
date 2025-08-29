package composicion;

import java.util.ArrayList;
import java.util.List;

public class Carrera {

    //Atributos
    private String denominacion;
    private int codigo;
    private List<Materia> materias = new ArrayList<>();

    //Constructores

    public Carrera(String denominacion, int codigo) {
        this.denominacion = denominacion;
        this.codigo = codigo;
        materias = new ArrayList<>();
    }

    // Métodos
    public void agregarMateria(String nombre, int codigoMateria) {
        Materia m1 = new Materia(nombre, codigoMateria);
        this.materias.add(m1);
    }

    @Override
    public String toString() {
        return "Carrera: " + denominacion + " " + "Codigo: " + codigo + " " + "Materias: " + materias;
    }
}
