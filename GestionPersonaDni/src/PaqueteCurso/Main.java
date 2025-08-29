package PaqueteCurso;

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Thomy",912);
        Estudiante e2 = new Estudiante("Pulpo",666);
        Estudiante e3 = new Estudiante("Samigoat",777);

        Curso c1 = new Curso("POO", "Mañana");
        Curso c2 = new Curso("Progra", "Mañana");
        Curso c3 = new Curso("GUS", "Noche");

        c1.agregarEstudiante(e1);
        c1.agregarEstudiante(e2);
        c1.agregarEstudiante(e3);
        System.out.println(c1);
    }
}
