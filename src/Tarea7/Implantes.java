package Tarea7;

public class Implantes extends OdontologiaWeb{
	public String tipoImplante, duracionImplante, controlImplante;
	
	public Implantes() {
		
	}
	
	public Implantes(String _tipoImplante, String _duracionImplante, String _controlImplante) {
		this.tipoImplante = _tipoImplante;
		this.duracionImplante = _duracionImplante;
		this.controlImplante = _controlImplante;
	}
	
	
	@Override
	public void imprimirDatos() {
		System.out.println("El tipo de implante es: " + tipoImplante
				+ " deben ser usados por: " + duracionImplante
				+ " los controles son los días " + controlImplante);
	}	
	
}
