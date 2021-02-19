package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import models.Departamento;
import models.Doctor;
import models.Empleado;
import models.Enfermo;
import models.Hospital;
import oracle.jdbc.OracleDriver;

public class RepositoryMother {

    private Connection getConnection() throws SQLException {
        DriverManager.registerDriver(new OracleDriver());
        String cadena = "jdbc:oracle:thin:@localhost:1521:xe";
        Connection cn = DriverManager.getConnection(cadena, "system", "oracle");
        return cn;
    }

    public ArrayList<Departamento> getDepartamento() throws SQLException {
        Connection cn = this.getConnection();
        String sql = "select * from dept";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Departamento> lista = new ArrayList<>();
        while (rs.next()) {
            int num = rs.getInt("DEPT_NO");
            String nom = rs.getString("NOMBRE");
            String loc = rs.getString("LOC");
            Departamento dept = new Departamento(num, nom, loc);
            lista.add(dept);
        }
        rs.close();
        cn.close();
        return lista;
    }

    public ArrayList<Empleado> getEmpleado() throws SQLException {
        Connection cn = this.getConnection();
        String sql = "select * from emp";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Empleado> lista = new ArrayList<>();
        while (rs.next()) {
            int num = rs.getInt("EMP_NO");
            String ape = rs.getString("APELLIDO");
            String ofi = rs.getString("OFICIO");
            int dir = rs.getInt("DIR");
            String fech = rs.getString("FECHA_ALT");
            int sal = rs.getInt("SALARIO");
            int com = rs.getInt("COMISION");
            int dep = rs.getInt("DEPT_NO");
            Empleado emp = new Empleado(num, ape, ofi, dir, fech, sal, com, dep);
            lista.add(emp);
        }
        rs.close();
        cn.close();
        return lista;
    }

    public ArrayList<Enfermo> getEnfermo() throws SQLException {
        Connection cn = this.getConnection();
        String sql = "select * from enfermo";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Enfermo> lista = new ArrayList<>();
        while (rs.next()) {
            int ins = rs.getInt("INSCRIPCION");
            String ape = rs.getString("APELLIDO");
            String dir = rs.getString("DIRECCION");
            String fech = rs.getString("FECHA_NAC");
            String sex = rs.getString("SEXO");
            int num = rs.getShort("NSS");
            Enfermo enf = new Enfermo(ins, ape, dir, fech, sex, num);
            lista.add(enf);
        }
        rs.close();
        cn.close();
        return lista;
    }

    public ArrayList<Doctor> getDoctor() throws SQLException {
        Connection cn = this.getConnection();
        String sql = "select * from doctor";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Doctor> lista = new ArrayList<>();
        while (rs.next()) {
            int hos = rs.getInt("HOSPITAL_COD");
            int doc = rs.getInt("DOCTOR_NO");
            String ape = rs.getString("APELLIDO");
            String esp = rs.getString("ESPECIALIDAD");
            int sal = rs.getInt("SALARIO");
            Doctor doct = new Doctor(hos, doc, ape, esp, sal);
            lista.add(doct);
        }
        rs.close();
        cn.close();
        return lista;
    }

    public ArrayList<Hospital> getHospital() throws SQLException {
        Connection cn = this.getConnection();
        String sql = "select * from hospital";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Hospital> lista = new ArrayList<>();
        while (rs.next()) {
            int hos = rs.getInt("HOSPITAL_COD");
            String nom = rs.getString("NOMBRE");
            String dir = rs.getString("DIRECCION");
            int tel = rs.getInt("TELEFONO");
            int cam = rs.getInt("NUM_CAMA");
            Hospital hosp = new Hospital(hos, nom, dir, tel, cam);
            lista.add(hosp);
        }
        cn.close();
        rs.close();
        return lista;

    }
}
