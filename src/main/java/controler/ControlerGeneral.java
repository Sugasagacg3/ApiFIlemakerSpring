package controler;


import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import dominios.Prueba4;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import repository.RepositoryImplementacion;
import service.PruebaImplemet;
@Controller
@ResponseBody
@Tag(name = "Controler a base de consultas SQL", description = "Api Filemaker Java basada en Consultas SQL con los metodos Execute Query y ExecuteUpdate. Arquitectura Hexagonal.")
public class ControlerGeneral {

	@Autowired
	PruebaImplemet pruebaImplementacion;
	@Autowired
	RepositoryImplementacion repositoryImplementacion;

	@GetMapping("/api")
	@Operation(summary = "Ejecuta una Query tipo Update con parametros ")
	public ArrayList<Object> listar() throws SQLException {

		ArrayList<Object> resultado = repositoryImplementacion.metodoExecute(Prueba4.class, "Select * from prueba4 where Nombre='Joselito'");

		return resultado;

	}
	@Operation(summary = "Ejecuta una Query tipo Execute (retorna resultados) sin paramtros. ")
	@PostMapping("/api2")

	public String insertar(@RequestParam String url, @RequestParam String nombre) {
		String[] parametros = { url, nombre };

		String sql = "INSERT INTO prueba4 (url, Nombre) VALUES ( ? , ?)";
		try {
			repositoryImplementacion.metodoUpdateParametros(Prueba4.class, sql, parametros);
			return "ok";
		} catch (Exception e) {
			return "Error";
		}

	}

}
