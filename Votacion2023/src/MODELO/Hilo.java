package MODELO;

public class Hilo extends Thread{
	
	private int edad, voto;
	private String ciudad;
	private Recurso recurso=null;
	
	public Hilo(int edad, int voto, String ciudad) {
		this.edad = edad;
		this.voto = voto;
		this.ciudad = ciudad;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getVoto() {
		return voto;
	}
	public void setVoto(int voto) {
		this.voto = voto;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public Recurso getRecurso() {
		return recurso;
	}
	public void setRecurso(Recurso recurso) {
		this.recurso = recurso;
	}
	
	@Override
	public void run() {
		
		
	}
}