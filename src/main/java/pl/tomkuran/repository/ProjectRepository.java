package pl.tomkuran.repository;

import org.springframework.data.repository.CrudRepository;
import pl.tomkuran.domain.Project;

/**
 * Created by TKURAN on 3/18/2016.
 */
public interface ProjectRepository extends CrudRepository<Project, Integer> {
}
