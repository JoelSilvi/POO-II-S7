package Patrones;

public class Especialidades extends Citas {
	
	public Especialidades() {
		
	}
	
	public void especialidades() {
		if (valor == 1) {
			System.out.println("ESPECIALIDADES MAÑANA");
			System.out.println("Implantes");
			System.out.println("Diagnóstico");
			System.out.println("Sensibilidad Dental");	
		}else if(valor == 2) {
			System.out.println("ESPECIALIDADES TARDE");
			System.out.println("Ortodoncista");
			System.out.println("Endodoncista");
			System.out.println("Patólogo Oral");
		}else if(valor == 3) {
			System.out.println("ESPECIALIDADES SOBRECUPO");
			System.out.println("Diagnóstico");
			System.out.println("Endodoncista");
			System.out.println("Ortodoncista");
		}
		
	}
	
}
