package controler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import dominios.Prueba4;
import repository.RepositoryImplementacion;
import service.PruebaImplemet;

@ResponseBody
@RestController
public class ControlerGeneral {

	@Autowired
	PruebaImplemet pruebaImplementacion;
	@Autowired
	RepositoryImplementacion repositoryImplementacion;
	
	@GetMapping("/api")
	@ResponseBody
	public ArrayList<Object> listar() throws SQLException {
		
		ArrayList<Object> resultado = repositoryImplementacion.metodoExecute(Prueba4.class, "Select * from prueba4");
		
		return  resultado;

	}
	
	@PostMapping("/api2")
	
	public String insertar( @RequestParam String url,
	 @RequestParam String nombre) {
		String[] parametros={url,nombre};
	
		
		String sql = "INSERT INTO prueba4 (url, Nombre) VALUES ( ? , ?)";
		try {
			repositoryImplementacion.metodoUpdateParametros(Prueba4.class, sql, parametros);
			return "ok" ;
		}catch(Exception e) {
		//	if (e ="Invalid parameter binding(s)") {
				return "Ha introducido caracteres no permitidos";
			}
			
		}
	
	}



