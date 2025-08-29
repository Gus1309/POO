package PersonaDni;

public class Main {
    public static void main(String[] args) {
        Dni dni1 = new Dni(26062011);
        Persona persona1 = new Persona("Julian", "Alvarez", dni1);

        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Apellido: " + persona1.getApellido());
        persona1.getDni().mostrardatos();

        Dni dni2 = new Dni(46876833);
        Persona persona2 = new Persona("Gus Gus", "Gus", dni2);
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Apellido: " + persona2.getApellido());
        persona2.getDni().mostrardatos();
    }
}