package io.github.tassara.libraryapi;

import io.github.tassara.libraryapi.model.Autor;
import io.github.tassara.libraryapi.repository.AutorRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		var context = SpringApplication.run(Application.class, args);
		AutorRepository autorRepository = context.getBean(AutorRepository.class);

		exemploSalvarRegistro(autorRepository);
	}

	public static void exemploSalvarRegistro(AutorRepository autorRepository){
		Autor autor = new Autor();
		autor.setNome("Tassara");
		autor.setNacionalidade("Brasileiro");
		autor.setDataNascimento(LocalDate.of(2002,5,30));

		var autorSalvo = autorRepository.save(autor);
		System.out.println("Autor salvo com sucesso!" + autorSalvo);
	}

}
