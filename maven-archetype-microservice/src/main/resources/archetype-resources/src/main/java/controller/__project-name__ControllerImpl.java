package ${package}.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ${package}.controller.swagger.${project-name}CtrlSwagger;
import ${package}.model.${project-name}Vo;

@RestController
@RequestMapping("/${project-name.toLowerCase()}")
public class ${project-name}ControllerImpl implements ${project-name}CtrlSwagger {

	@PostMapping
	public ResponseEntity<${project-name}Vo> add${project-name}(@RequestBody ${project-name}Vo ${project-name.toLowerCase()}Vo) {
		return ResponseEntity.status(HttpStatus.CREATED).body(${project-name.toLowerCase()}Vo);
	}

}
