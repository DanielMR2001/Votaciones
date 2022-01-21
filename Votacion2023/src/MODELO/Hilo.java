package MODELO;

import org.hibernate.SessionFactory;

public class Hilo extends Thread{
	
	private int edad, voto;
	private String ciudad;
	private Recurso recurso=null;
	private SessionFactory sessionFactory;
	
	public Hilo(int edad, int voto, String ciudad, SessionFactory sessionFactory) {
		this.edad = edad;
		this.voto = voto;
		this.ciudad = ciudad;
		this.sessionFactory = sessionFactory;
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
	
	@SuppressWarnings("static-access")
	@Override
	public void run() {
		try {
			recurso=recurso.getInstancia();
			boolean comprobar=recurso.calcularVoto(voto, edad);
			if(comprobar==true) {
					if(edad>=18 && edad<=25) { 
						if(voto>=0 && voto<=30) { System.out.println(ciudad+"("+edad+" Años)--"+voto+"---PP"); }
						if(voto>=31 && voto<=50) { System.out.println(ciudad+"("+edad+" Años)--"+voto+"---PSOE");}
						if(voto>=51 && voto<=70) { System.out.println(ciudad+"("+edad+" Años)--"+voto+"---VOX"); }
						if(voto>=71 && voto<=100) { System.out.println(ciudad+"("+edad+" Años)--"+voto+"---CIUDADANOS");}
					}
					if(edad>=26 && edad<=40) { 
						if(voto>=0 && voto<=20) { System.out.println(ciudad+"("+edad+" Años)--"+voto+"---PP");}
						if(voto>=21 && voto<=55) { System.out.println(ciudad+"("+edad+" Años)--"+voto+"---PSOE");}
						if(voto>=56 && voto<=85) { System.out.println(ciudad+"("+edad+" Años)--"+voto+"---VOX");}
						if(voto>=86 && voto<=100) { System.out.println(ciudad+"("+edad+" Años)--"+voto+"---CIUDADANOS");}
					}
					if(edad>=41 && edad<=65) { 
						if(voto>=0 && voto<=10) { System.out.println(ciudad+"("+edad+" Años)--"+voto+"---PP");}
						if(voto>=11 && voto<=55) { System.out.println(ciudad+"("+edad+" Años)--"+voto+"---PSOE");}
						if(voto>=56 && voto<=90) { System.out.println(ciudad+"("+edad+" Años)--"+voto+"---VOX");}
						if(voto>=91 && voto<=100) {System.out.println(ciudad+"("+edad+" Años)--"+voto+"---CIUDADANOS");}
					}
					if(edad>=66 && edad<=110) { 
						if(voto>=0 && voto<=25) { System.out.println(ciudad+"("+edad+" Años)--"+voto+"---PP");}
						if(voto>=26 && voto<=60) { System.out.println(ciudad+"("+edad+" Años)--"+voto+"---PSOE");}
						if(voto>=61 && voto<=95) { System.out.println(ciudad+"("+edad+" Años)--"+voto+"---VOX");}
						if(voto>=96 && voto<=100) { System.out.println(ciudad+"("+edad+" Años)--"+voto+"---CIUDADANOS");}
					}	
				}
		}catch(Exception e) { e.printStackTrace(); }
	}
}