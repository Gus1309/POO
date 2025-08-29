package PersonaDni;

public class Dni {
    //Atributos
    private int numero;
    private long tramite;

    //Constructores
    public Dni() {
        numero = 0;
        tramite = 0;
    }
    public Dni(int numero, long tramite) {
        this.numero = numero;
        this.tramite = tramite;
    }
    public Dni(int numero) {
        this.numero = numero;
        this.tramite = 0;
    }
    //setter
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setTramite(long tramite) {
        this.tramite = tramite;
    }

    //getters
    public int getNumero() {
        return numero;
    }
    public long getTramite() {
        return tramite;
    }

    //otros metodos
    public void mostrardatos(){
        System.out.println("DNI: " + this.numero + " tramite: " + this.tramite);
    }

}
