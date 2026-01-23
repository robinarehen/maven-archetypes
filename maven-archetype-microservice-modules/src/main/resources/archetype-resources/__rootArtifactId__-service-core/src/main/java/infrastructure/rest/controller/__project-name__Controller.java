package ${package}.infrastructure.rest.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ${package}.infrastructure.rest.dto.${project-name}Response;
import ${package}.infrastructure.rest.dto.${project-name}Request;

import ${package}.infrastructure.rest.api.${project-name}Api;

@RestController
@RequestMapping("/${project-name.toLowerCase()}")
public class ${project-name}Controller implements ${project-name}Api {

	@PostMapping
	public ResponseEntity<${project-name}Response> exampleMethod(@RequestBody ${project-name}Request request) {
		return ResponseEntity.of(Optional.empty());
	}

}
