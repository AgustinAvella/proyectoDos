package org.aavella.proyectoDos;

public class Empleado extends Persona {
	private double remuneracion;
	private int empleadoId;
	
	public int aumentarRemuneracion(double porcentaje) {
		double aumento = (remuneracion*porcentaje)/100;
		this.setRemuneracion(this.remuneracion+aumento);
		return (int) aumento;
	}

	public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion,
			int empleadoId) {
		super(nombre, apellido, numeroFiscal, direccion);
		this.remuneracion = remuneracion;
		this.empleadoId = empleadoId;
	}

	public double getRemuneracion() {
		return remuneracion;
	}

	public void setRemuneracion(double remuneracion) {
		this.remuneracion = remuneracion;
	}

	public int getEmpleadoId() {
		return empleadoId;
	}

	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ "remuneracion: "+ remuneracion+"Empleado ID: "+empleadoId;
	}

	
}
