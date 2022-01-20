package MODELO;

public class GuardarVotacion {
	
	private int edad;
	private String comunidad, partido;
	
	public GuardarVotacion(int edad, String comunidad, String partido) {
		this.edad = edad;
		this.comunidad = comunidad;
		this.partido = partido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getComunidad() {
		return comunidad;
	}
	public void setComunidad(String comunidad) {
		this.comunidad = comunidad;
	}
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	@Override
	public String toString() {
		return "GuardarVotacion [edad=" + edad + ", comunidad=" + comunidad + ", partido=" + partido + "]";
	}
}