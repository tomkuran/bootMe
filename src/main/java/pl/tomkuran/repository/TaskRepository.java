package pl.tomkuran.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import pl.tomkuran.domain.Task;


/**
 * Created by TKURAN on 3/21/2016.
 */
public interface TaskRepository extends PagingAndSortingRepository<Task, Integer> {
}
