package org.aavella.proyectoDos;

public class Cliente extends Persona {
	private int clienteId;

	public Cliente(String nombre, String apellido, String numeroFiscal, String direccion, int clienteId) {
		super(nombre, apellido, numeroFiscal, direccion);
		this.clienteId = clienteId;
	}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"ID de cliente: "+clienteId;
	}
	
}
