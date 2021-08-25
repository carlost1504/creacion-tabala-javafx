package model;

public class domicilio {
	private String id;
	private String pedido;
	private double precio;
	private String direccion;
	
	
	
	public domicilio(String id, String pedido, double precio, String direccion) {
		super();
		this.id = id;
		this.pedido = pedido;
		this.precio = precio;
		this.direccion = direccion;
	}
	public domicilio() {
		
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPedido() {
		return pedido;
	}
	public void setPedido(String pedido) {
		this.pedido = pedido;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	

}
