package pl.tomkuran.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import pl.tomkuran.domain.TaskType;

/**
 * Created by TKURAN on 3/21/2016.
 */
public interface TaskTypeRepository extends PagingAndSortingRepository<TaskType, Integer> {
}
