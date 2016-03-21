package pl.tomkuran.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import pl.tomkuran.domain.Person;

/**
 * Created by TKURAN on 3/17/2016.
 */
public interface PersonRepository extends PagingAndSortingRepository<Person, Integer> {
}
