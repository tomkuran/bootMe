package pl.tomkuran.service;

import pl.tomkuran.domain.Person;

import java.util.List;

/**
 * Created by TKURAN on 3/18/2016.
 */
public interface PersonService {

    Person create(Person person);

    Person getById(Integer id);

    List<Person> get();

    Person update(Integer id, Person person);

    void delete(Integer id);
}
