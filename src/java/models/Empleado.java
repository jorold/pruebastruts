package models;

public class Empleado {

    private int numero;
    private String apellido;
    private String oficio;
    private int director;
    private String fecha;
    private int salario;
    private int comision;
    private int dept;

    public Empleado() {
    }

    public Empleado(int num, String ape, String ofi, int dir, String fech,
            int sal, int com, int dep) {
        this.numero = num;
        this.apellido = ape;
        this.oficio = ofi;
        this.director = dir;
        this.fecha = fech;
        this.salario = sal;
        this.comision = com;
        this.dept = dep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public int getDirector() {
        return director;
    }

    public void setDirector(int director) {
        this.director = director;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getDept() {
        return dept;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

}
