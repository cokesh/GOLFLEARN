package egovframework.msa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("egovframework.*")
@SpringBootApplication
public class CatalogsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogsApplication.class, args);
	}

}
