package models;

public class Doctor {

    private int hospital;
    private int doctor;
    private String apellido;
    private String especialidad;
    private int salario;

    public Doctor() {
    }

    public Doctor(int hos, int doc, String ape, String esp, int sal) {
        this.hospital = hos;
        this.doctor = doc;
        this.apellido = ape;
        this.especialidad = esp;
        this.salario = sal;
    }

    public int getHospital() {
        return hospital;
    }

    public void setHospital(int hospital) {
        this.hospital = hospital;
    }

    public int getDoctor() {
        return doctor;
    }

    public void setDoctor(int doctor) {
        this.doctor = doctor;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
