package pl.tomkuran.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.tomkuran.domain.Person;
import pl.tomkuran.repository.PersonRepository;
import pl.tomkuran.service.PersonService;

import java.util.List;


/**
 * Created by TKURAN on 3/18/2016.
 */

@RestController
public class PersonResource {

    @Autowired
    PersonService personService;

    /*POST /v1/persons/ */
    @RequestMapping(value = "/v1/persons/", method = RequestMethod.POST)
    Person save(@RequestBody Person person) {
        return personService.create(person);
    }

    @RequestMapping(value = "/v1/persons/{id}", method = RequestMethod.PUT)
    Person update(@PathVariable Integer id, @RequestBody Person person) {
        return personService.update(id, person);
    }

    @RequestMapping(value = "/v1/persons/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable Integer id) {
        personService.delete(id);
    }

    @RequestMapping(value = "/v1/persons/{id}", method = RequestMethod.GET)
    Person getById(@PathVariable Integer id) {
        return personService.getById(id);
    }

    @RequestMapping(value = "/v1/persons/", method = RequestMethod.GET)
    List<Person> get() {
        return personService.get();
    }

}
