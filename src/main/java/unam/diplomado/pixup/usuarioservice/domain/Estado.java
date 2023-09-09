package unam.diplomado.pixup.usuarioservice.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="estados") //Collections o TABLA de la base de datos de MONGO de donde se obtiene los datos
public class Estado {
	@Id 
	private String id;
	private String nombre;
	

}
