package pl.tomkuran.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.tomkuran.configuration.RepositoryConfiguration;
import pl.tomkuran.domain.Person;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by TKURAN on 3/18/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {RepositoryConfiguration.class})
public class PersonRepositoryTest {

    @Autowired
    private PersonRepository personRepository;

    @Test
    public void testSavePerson() {
        Person person = new Person();
        person.setFirstName("Tomasz");
        person.setLastName("Kuran");


        //save person
        personRepository.save(person);
        assertNotNull(person.getId());

        //fetch from db

        Person personFromDB = personRepository.findOne(person.getId());

        assertEquals(personFromDB.getId(),person.getId());
    }

}
