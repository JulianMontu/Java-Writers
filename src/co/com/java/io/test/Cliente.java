package co.com.java.io.test;

import java.io.Serializable;

public class Cliente implements Serializable {
	private static final long serialVersionUID = -2932668542996488556L;
	private String nombre;
	private int documento;
	
	public  Cliente(String nombre, int documento) {
		super();
		this.nombre=nombre;
		this.documento=documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}
		
	



}
