package composicion;

public class Main {
    public static void main(String[] args) {
        Carrera c1 = new Carrera("Ingeniería en Informática", 123);
        c1.agregarMateria("POO", 999);
        c1.agregarMateria("Messi", 10);
        System.out.println(c1.toString());
    }


}
