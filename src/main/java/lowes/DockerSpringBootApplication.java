package lowes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringBootApplication.class, args);
		System.out.println("Spring boot application started");
	}
}
