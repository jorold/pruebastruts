package models;

public class Sala {

    private int hospital;
    private int sala;
    private String nombre;
    private int camas;

    public Sala() {
    }

    public Sala(int hos, int sal, String nom, int cam) {
        this.hospital = hos;
        this.sala = sal;
        this.nombre = nom;
        this.camas = cam;
    }

    public int getHospital() {
        return hospital;
    }

    public void setHospital(int hospital) {
        this.hospital = hospital;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }
}
