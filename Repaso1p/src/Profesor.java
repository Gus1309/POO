public class Profesor extends Persona {
    private String especialidad;
    private Nivel nivel;

    public Profesor(String nombre, int edad, String especialidad, Nivel nivel) {
        super(nombre, edad);
        this.especialidad = especialidad;
        this.nivel = nivel;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public Nivel getNivel() {
        return nivel;
    }
    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public void dictarClase() {

        System.out.println(getNombre() + " está dictando clase de " + especialidad + ".");
    }

    @Override
    public void trabajar() {

        dictarClase();
    }

    @Override
    public String toString() {

        return super.toString() + ", Especialidad: " + especialidad + ", Nivel: " + nivel;
    }
}
