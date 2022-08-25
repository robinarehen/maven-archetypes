package ${package}.api.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ${package}.library.controller.${project-name}Controller;

@RestController
@RequestMapping("/${project-name.toLowerCase()}")
public class ${project-name}ControllerImpl implements ${project-name}Controller {

	@PostMapping
	public ResponseEntity<String> exampleMethod(@RequestBody String requestVo) {
		return ResponseEntity.of(Optional.empty());
	}

}
