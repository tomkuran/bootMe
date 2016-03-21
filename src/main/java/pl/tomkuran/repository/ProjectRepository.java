package pl.tomkuran.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import pl.tomkuran.domain.Project;

/**
 * Created by TKURAN on 3/18/2016.
 */
public interface ProjectRepository extends PagingAndSortingRepository<Project, Integer> {
}
