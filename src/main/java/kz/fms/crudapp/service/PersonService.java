package kz.fms.crudapp.service;

import kz.fms.crudapp.model.Person;
import kz.fms.crudapp.model.Region;
import kz.fms.crudapp.repository.PersonRepository;
import kz.fms.crudapp.repository.RegionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Bolat Ashirbek on 08.06.2020.
 */

@Slf4j
@Service
public class PersonService {
    private final PersonRepository personRepository;

    private final RegionRepository regionRepository;

    @Autowired
    public PersonService(PersonRepository personRepository, RegionRepository regionRepository) {
        this.personRepository = personRepository;
        this.regionRepository = regionRepository;
    }

    public List<Person> getAllPerson() {
        log.info("IN PersonService getAllPerson");
        return personRepository.findAll();
    }

    public Person findById(Long id) {
        log.info("IN PersonService findById {}", id);
        return personRepository.getOne(id);
    }

    public void addPerson(Person person) {
        log.info("IN PersonService addPerson {}", person);
        personRepository.save(person);
    }

    public void updatePerson(Person person) {
        log.info("IN PersonService updatePerson {}", person);
        personRepository.save(person);
    }

    public void deletePerson(Long id) {
        log.info("IN PersonService deletePerson {}", id);
        personRepository.deleteById(id);
    }

    public Person findByFirstName(String firstName) {
        log.info("IN PersonService findByFirstName {}", firstName);
        return personRepository.findByFirstName(firstName);
    }

    public List<Region> getAllRegion() {
        log.info("IN PersonService getAllRegion");
        return (List<Region>) regionRepository.findAll();
    }
}
