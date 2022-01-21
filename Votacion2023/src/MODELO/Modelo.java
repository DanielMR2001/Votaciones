package MODELO;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class Modelo {
	
	static ArrayList<Datos>listaDatos=new ArrayList<Datos>();
	
    public static void main (String [] args) {

        SessionFactory sessionFactory = null;

        try {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            sessionFactory = configuration.buildSessionFactory();

            sessionFactory.getCurrentSession().beginTransaction();
            
            listar("Andalucía", sessionFactory);
            listar("Aragon", sessionFactory);
            listar("Asturias", sessionFactory);
            listar("Baleares", sessionFactory);
            listar("Canarias", sessionFactory);
            listar("Cantabria", sessionFactory);
            listar("Castilla La Mancha", sessionFactory);
            listar("Castilla y Leon", sessionFactory);
            listar("Catalunia", sessionFactory);
            listar("Comunidad Valenciana", sessionFactory);
            listar("Extremadura", sessionFactory);
            listar("Galicia", sessionFactory);
            listar("Madrid", sessionFactory);
            listar("Murcia", sessionFactory);
            listar("Navarra", sessionFactory);
            listar("Pais Vasco", sessionFactory);
            listar("La Rioja", sessionFactory);
            listar("Ceuta", sessionFactory);
            listar("Melilla", sessionFactory);

            sessionFactory.getCurrentSession().getTransaction().commit();
            
        } catch (Exception e) {
        	e.printStackTrace();
            sessionFactory.getCurrentSession().getTransaction().rollback();
            }finally {
            	if (sessionFactory != null) {
                    sessionFactory.close();
                }
        }
    }
    
    @SuppressWarnings("unchecked")
	public static ArrayList<Datos> listar(String ciudad, SessionFactory s) throws InterruptedException {
    	@SuppressWarnings("rawtypes")
		Query query3 = s.getCurrentSession().createSQLQuery("SELECT RANGO_18_25, RANGO_26_40, RANGO_41_65,RANGO_MAS_66, TOTAL_HABITANTES FROM PORCENTAJES_RANGOEDAD WHERE NOMBRE_COMUNIDAD=:nombre");		
    	query3.setParameter("nombre", ciudad);       
    	List<Object[]> resultado = query3.list();
		for (Object[] fila : resultado) {
			Integer rango1825 = (Integer) fila[0]; 
			Integer rango2640 = (Integer) fila[1]; 
			Integer rango4165 = (Integer) fila[2]; 
			Integer rango66 = (Integer) fila[3];
			Integer habitantes = (Integer) fila[4];
			
			int habitantes1825=((rango1825*habitantes)/100)/100000;
			int habitantes2640=((rango2640*habitantes)/100)/100000;
			int habitantes4165=((rango4165*habitantes)/100)/100000;
			int habitantes66=((rango66*habitantes)/100)/100000;
			
			if(habitantes1825==0) {habitantes1825=1;}
			if(habitantes2640==0) {habitantes2640=1;}
			if(habitantes4165==0) {habitantes4165=1;}
			if(habitantes66==0) {habitantes66=1;}
			
			listaDatos.add(new Datos(ciudad, habitantes1825,habitantes2640,habitantes4165,habitantes66));
			
			for(int i=0; i<habitantes1825; i++) {
				int edad1825=(int)(Math.random()*(25 - 18)) + 18;
				int aleatorio1825=(int)(Math.random()*100);
				Hilo rangoEdad1825= new Hilo(edad1825, aleatorio1825, ciudad, s);
				rangoEdad1825.start();
				rangoEdad1825.join();
			}
			System.out.println("---------------------------");
			for(int i=0; i<habitantes2640; i++) {
				int edad2640=(int)(Math.random()*(40 - 26)) + 26;
				int aleatorio2640=(int)(Math.random()*100);
				Hilo rangoEdad2640= new Hilo(edad2640, aleatorio2640, ciudad, s);
				rangoEdad2640.start();
				rangoEdad2640.join();
			}
			System.out.println("---------------------------");
			for(int i=0; i<habitantes4165; i++) {
				int aleatorio4165=(int)(Math.random()*100);
				int edad4165=(int)(Math.random()*(65 - 41)) + 41;
				Hilo rangoEdad4165= new Hilo(edad4165, aleatorio4165, ciudad, s);
				rangoEdad4165.start();
				rangoEdad4165.join();
			}
			System.out.println("---------------------------");
			for(int i=0; i<habitantes66; i++) {
				int aleatorio66=(int)(Math.random()*100);
				int edad66=(int)(Math.random()*(110 - 66)) + 66;
				Hilo rangoEdad66= new Hilo(edad66, aleatorio66, ciudad, s);
				rangoEdad66.start();
				rangoEdad66.join();
			}
			System.out.println("---------------------------");
		}
		return listaDatos;    
    }
}