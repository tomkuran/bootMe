package pl.tomkuran.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.tomkuran.domain.Person;
import pl.tomkuran.repository.PersonRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Created by TKURAN on 3/18/2016.
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;


    @Override
    public Person create(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person getById(Integer id) {
        return personRepository.findOne(id);
    }

    @Override
    public List<Person> get() {
        return StreamSupport.stream(personRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    @Override
    public Person update(Integer id, Person person) {
        person.setId(id);
        return personRepository.save(person);
    }

    @Override
    public void delete(Integer id) {
        personRepository.delete(id);
    }
}
