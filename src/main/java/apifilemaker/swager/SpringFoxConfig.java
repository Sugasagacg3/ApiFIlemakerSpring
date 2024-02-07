package apifilemaker.swager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;




@OpenAPIDefinition
@Configuration
public class SpringFoxConfig {
	
	@Bean
	   public OpenAPI defineOpenApi() {
	   
	        return new OpenAPI().components(new Components())
	                .info(new Info().title("Api Filemaker / Java")
	                        .description("Ejemplo de API REST")
	                        .contact(new Contact()
	                                .name("Jose Sugasaga")
	                                .email("jose@masqueideas.com")
	                                .url("https://tipicocantabria.com"))
	                        .version("1.0"));
	    }

	}


