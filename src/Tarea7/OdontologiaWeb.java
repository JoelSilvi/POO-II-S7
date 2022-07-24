package Tarea7;

public class OdontologiaWeb implements CitasOdontologia{
	public String name, lastName, address, rut;

	@Override
	public String showCitas(String datos) {
		return datos;
	}

	public OdontologiaWeb() {
	
	}
	
	public OdontologiaWeb(String _name, String _lastName, String _address, String _rut) {
		this.name = _name;
		this.lastName = _lastName;
		this.address = _address;
		this.rut = _rut;
	}
	
	public void imprimirDatos() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}
	
	public static void main(String[] args) {
		Diagnostico diagnostico = new Diagnostico("Normal,","23-12-2022,","Válido");
		diagnostico.imprimirDatos();
		System.out.println("\n");
		
		Implantes implantes = new Implantes("Metálico,","8 meses,","5 de cada mes");
		implantes.imprimirDatos();
		System.out.println("\n");
		
		SensibilidadDental sensibilidad = new SensibilidadDental ("Grave,","Dañado,","Medio");
		sensibilidad.imprimirDatos();
	}

}