package Clases;

import java.util.Date;

public class Cliente{
	private String DNI;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private Date fechaNacimiento;
	
	public Cliente() {
		super();
	}
	public Cliente(String dNI, String nombre, String apellido1, String apellido2, Date fechaNacimiento) {
		super();
		this.DNI = dNI;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		if(dNI.length() == 9) {
			DNI = dNI;
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	@Override
	public String toString() {
		return "Cliente [DNI=" + DNI + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
}
