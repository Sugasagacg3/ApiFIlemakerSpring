package service;


import java.beans.JavaBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dominios.Prueba4;
import repository.RepositoryImplementacion;

@Component
public class PruebaImplemet {
	
	/*		RepositoryImplementacion repository= new RepositoryImplementacion();
	
public ArrayList<Object> busquedaporConsulta() throws SQLException  {
		ArrayList<Object> resultado=repository.buscarSinParametros(Prueba4.class, "Select * from prueba4");
		
		return resultado;
	}

		public void nuevoRegistro(String sql) {
			try {
			//System.out.println(url);
				String[] parametros = {"Hola1", "Adios1"};
				
			 
			repository.metodoUpdate(Prueba4.class, sql,parametros);

		}catch(Exception e){
			System.out.println("Error");
			System.out.println(e);
		}
		}
}*/}
