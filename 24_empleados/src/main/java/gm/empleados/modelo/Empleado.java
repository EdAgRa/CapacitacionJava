package gm.empleados.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
//@ToString

public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idEmpleado;//id_empleado
    String nombreEmpleado;
    String departamento;
    Double sueldo;

    @Override
    public String toString() {
        return "Empleado{idEmpleado=" + idEmpleado +
                ", nombreEmpleado='" + nombreEmpleado +
                "', departamento='" + departamento +
                ", sueldo='"+sueldo+"'}";
    }

    /*// Getters y setters
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
*/
}
