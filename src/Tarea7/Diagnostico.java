package Tarea7;

public class Diagnostico extends OdontologiaWeb{
	public String tipoDiagnostico, fechaDiagnostico, estadoDiagnostico;
	
	
	public Diagnostico() {
		
	}
	
	
	public Diagnostico(String _tipoDiagnostico, String _fechaDiagnostico, 
			String  _estadoDiagnostico) {
		this.tipoDiagnostico = _tipoDiagnostico;
		this.fechaDiagnostico = _fechaDiagnostico;
		this.estadoDiagnostico = _estadoDiagnostico;
	}
	
	@Override
	public void imprimirDatos() {
		System.out.println("El tipo de diagnóstico es: " + tipoDiagnostico
				+ " la fecha agendada para el diagnóstico : " + fechaDiagnostico
				+ " el estado del diagnóstico es: " + estadoDiagnostico);
		
	}
}
