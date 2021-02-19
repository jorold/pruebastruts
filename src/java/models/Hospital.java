package models;

public class Hospital {

    private int hospital;
    private String nombre;
    private String direccion;
    private int telefono;
    private int camas;

    public Hospital() {
    }

    public Hospital(int hos, String nom, String dir, int tel, int cam) {
        this.hospital = hos;
        this.nombre = nom;
        this.direccion = dir;
        this.telefono = tel;
        this.camas = cam;
    }

    public int getHospital() {
        return hospital;
    }

    public void setHospital(int hospital) {
        this.hospital = hospital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }
}
