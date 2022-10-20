package ${package}.controller;

import org.springframework.http.ResponseEntity;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import ${package}.model.${project-name}Vo;

@Tag(name = "${project-name}")
public interface ${project-name}Controller {

	@Operation(summary = "Post add new ${project-name}")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "${project-name} was created"),
			@ApiResponse(responseCode = "400", description = "Bad request", content = @Content),
			@ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content),
			@ApiResponse(responseCode = "403", description = "Forbidden", content = @Content),
			@ApiResponse(responseCode = "500", description = "Internal server error", content = @Content)
	})
	public ResponseEntity<${project-name}Vo> add${project-name}(${project-name}Vo ${project-name.toLowerCase()}Vo);
}
