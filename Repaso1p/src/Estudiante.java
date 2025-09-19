public class Estudiante extends Persona implements Registrable {
    private String matricula;
    private Nivel nivel;

    public Estudiante(String nombre, int edad, String matricula, Nivel nivel) {
        super(nombre, edad);
        this.matricula = matricula;
        this.nivel = nivel;
    }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public Nivel getNivel() { return nivel; }
    public void setNivel(Nivel nivel) { this.nivel = nivel; }

    //Método concreto 1
    public void estudiar() {
        System.out.println(getNombre() + " está estudiando.");
    }

    //Método concreto 2
    public void aprobarExamen() {
        System.out.println(getNombre() + " ha aprobado el examen.");
    }

    //Método concreto 3
    public void asistirClase() {
        System.out.println(getNombre() + " está asistiendo a clase.");
    }

    @Override
    public void registrar() {
        System.out.println("Estudiante registrado.");
    }

    @Override
    public void cancelar() {
        System.out.println("Registro cancelado.");
    }

    @Override
    public void trabajar() {
        System.out.println(getNombre() + " está haciendo tareas.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Matrícula: " + matricula + ", Nivel: " + nivel;
    }
}
