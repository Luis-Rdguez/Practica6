package Clases;

import java.util.Date;

public class Pedido extends Cliente{
	private int id;
	private double precio;
	private TipoProducto tipoProducto;
	private boolean extra;
	
	public Pedido(String dNI, String nombre, String apellido1, String apellido2, Date fechaNacimiento) {
		super(dNI, nombre, apellido1, apellido2, fechaNacimiento);
	}
	
	public Pedido(String dNI, String nombre, String apellido1, String apellido2, Date fechaNacimiento, int id,
			double precio, TipoProducto tipoProducto, boolean extra) {
		super(dNI, nombre, apellido1, apellido2, fechaNacimiento);
		this.id = id;
		this.precio = precio;
		this.tipoProducto = tipoProducto;
		this.extra = extra;
	}

	public int getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public TipoProducto getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(TipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public boolean isExtra() {
		if(this.precio > 100) {
			return true;
		}else {
			return false;
		}
			
	}
	public void setExtra(boolean extra) {
		this.extra = extra;
	}
	
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", precio=" + precio + ", tipoProducto=" + tipoProducto
				+ ", pagado=" + extra + "]";
	}
	
}
