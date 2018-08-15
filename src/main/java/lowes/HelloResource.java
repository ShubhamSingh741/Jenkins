package lowes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker/hello")
public class HelloResource {
	
	@GetMapping
	public String helloResource() {
		return "Hello from docker";
	}

}
