package pl.tomkuran.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.tomkuran.domain.Person;

/**
 * Created by TKURAN on 3/17/2016.
 */
public interface PersonRepository extends CrudRepository<Person, Integer> {
}
