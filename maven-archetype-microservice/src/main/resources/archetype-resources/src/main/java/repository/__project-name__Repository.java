package ${package}.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ${package}.entity.${project-name}Entity;

public interface ${project-name}Repository extends JpaRepository<${project-name}Entity, Integer> {

}
