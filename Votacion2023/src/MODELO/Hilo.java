package MODELO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
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
		Session session = null;
		recurso=recurso.getInstancia();
		try {
			session = sessionFactory.getCurrentSession();
			session.beginTransaction();	
			boolean comprobar=recurso.calcularVoto(voto, edad);
			if(comprobar==true) {
				agregarVotos(18, 25, 0, 30, 31, 50, 51, 70, 71, 100, session);
				agregarVotos(26, 40, 0, 20, 21, 55, 56, 85, 86, 100, session);
				agregarVotos(41, 65, 0, 10, 11, 55, 56, 90, 91, 100, session);
				agregarVotos(66, 110, 0, 25, 26, 60, 61, 95, 96, 100, session);				
			}
				this.sleep(100);			
		}catch(HibernateException | InterruptedException e) { e.printStackTrace();
			if (null != session) { session.getTransaction().rollback(); }
		} finally { if (null != session) { session.close(); } }
	}
	
	public void agregarVotos(int edad1, int edad2, int voto1, int voto2, int voto3, int voto4, int voto5, int voto6, int voto7, int voto8, Session session){
		if(edad>=edad1 && edad<=edad2) { 				
			if(voto>=voto1 && voto<=voto2) { System.out.println(ciudad+"("+edad+" Años)--"+voto+"---PP"); 										
				Ciudadano ciudadano1 =new Ciudadano();
				ciudadano1.setComunidad(ciudad);
				ciudadano1.setEdad(edad);
				ciudadano1.setPartido("PP");
				session.saveOrUpdate(ciudadano1);	           
				session.getTransaction().commit();		
			}
			if(voto>=voto3 && voto<=voto4) { System.out.println(ciudad+"("+edad+" Años)--"+voto+"---PSOE");						
				Ciudadano ciudadano2 =new Ciudadano();
				ciudadano2.setComunidad(ciudad);
				ciudadano2.setEdad(edad);
				ciudadano2.setPartido("PSOE");
				session.saveOrUpdate(ciudadano2);	           
				session.getTransaction().commit();	
			}
			if(voto>=voto5 && voto<=voto6) { System.out.println(ciudad+"("+edad+" Años)--"+voto+"---VOX"); 
				Ciudadano ciudadano3 =new Ciudadano();
				ciudadano3.setComunidad(ciudad);
				ciudadano3.setEdad(edad);
				ciudadano3.setPartido("VOX");
				session.saveOrUpdate(ciudadano3);	           
				session.getTransaction().commit();	
			}
			if(voto>=voto7 && voto<=voto8) { System.out.println(ciudad+"("+edad+" Años)--"+voto+"---CIUDADANOS");
				Ciudadano ciudadano4 =new Ciudadano();
				ciudadano4.setComunidad(ciudad);
				ciudadano4.setEdad(edad);
				ciudadano4.setPartido("CIUDADANOS");
				session.saveOrUpdate(ciudadano4);	           
				session.getTransaction().commit();	
			}
		}
	}
}