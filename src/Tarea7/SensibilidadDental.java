package Tarea7;

public class SensibilidadDental extends OdontologiaWeb {
	public String tipoFisura, tipoEsmalte, tipoCepillo;
	
	public SensibilidadDental() {
		
	}
	
	
	public SensibilidadDental(String _tipoFisura, String _tipoEsmalte, String _tipoCepillo) {
		this.tipoFisura = _tipoFisura;
		this.tipoEsmalte = _tipoEsmalte;
		this.tipoCepillo = _tipoCepillo;
	}
	
	
	@Override
	public void imprimirDatos() {
		System.out.println("El paciente tiene " + tipoFisura + " fisura"
				+ " el tipo de esmalte es: " + tipoEsmalte
				+ " y ocupa un cepillo tipo: " + tipoCepillo );
	}
}
