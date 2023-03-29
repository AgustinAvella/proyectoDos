package org.aavella.proyectoDos;

public class Gerente extends Empleado {



	public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion,
			int empleadoId, double presupuesto) {
		super(nombre, apellido, numeroFiscal, direccion, remuneracion, empleadoId);
		this.presupuesto = presupuesto;
	}

	private double presupuesto;

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"Presupuesto: "+presupuesto;
	}
	
	

}
