package unam.diplomado.pixup.usuarioservice.domain;


import java.util.Collection;
import java.util.LinkedHashSet;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection="usuarios")

public class Usuario {

	@Id
	private String id;
	@NotBlank(message="Es necesario indicar el nombre")
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String password;
	@NotBlank(message="Es necesario indicar el nombre")
	private String email;
	private String rfc;
	private Collection<Domicilio> domicilios = new LinkedHashSet<>();
}
