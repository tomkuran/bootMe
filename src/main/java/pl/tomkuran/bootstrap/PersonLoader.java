package pl.tomkuran.bootstrap;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import pl.tomkuran.domain.Person;
import pl.tomkuran.repository.PersonRepository;

/**
 * Created by TKURAN on 3/18/2016.
 */
@Component
public class PersonLoader implements ApplicationListener<ContextRefreshedEvent>{

    private Logger log = Logger.getLogger(PersonLoader.class);

    @Autowired
    private PersonRepository personRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event){
        Person ola = new Person();
        ola.setFirstName("Ola");
        ola.setLastName("Kuran");
        ola.setDescription("Ola - bardzo lubi koty, psy i konie.");
        personRepository.save(ola);
        log.info("Saved person: " + ola.getFirstName());

        Person tomek = new Person();
        tomek.setFirstName("Tomasz");
        tomek.setLastName("Kuran");
        tomek.setDescription("Ehh szkoda pisać...");
        personRepository.save(tomek);
        log.info("Saved person: " + tomek.getFirstName());

        Person jas = new Person();
        jas.setFirstName("Jaś");
        jas.setLastName("Kuran");
        jas.setDescription("Jaś Tomasz - zestresowany - zupełnie nie potrzebnie...");
        personRepository.save(jas);
        log.info("Saved person: " + jas.getFirstName());
    }
}
