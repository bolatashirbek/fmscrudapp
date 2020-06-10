package kz.fms.crudapp.rest;

import kz.fms.crudapp.config.Preconditions;
import kz.fms.crudapp.service.PersonService;
import kz.fms.crudapp.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Bolat Ashirbek on 08.06.2020.
 */

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/persons")
public class PersonRestController {

    private final PersonService personService;

    @Autowired
    public PersonRestController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Person>> getAllPerson() {
        List<Person> persons = this.personService.getAllPerson();
        if (persons.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(persons, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Person> findById(@PathVariable("id") Long personId) {
        if (personId == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Person person = this.personService.findById(personId);
        if (person == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

    @GetMapping(value = "/name/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findByName(@PathVariable("name") String name) {
        Preconditions.checkNotNull(name);
        return personService.findByFirstName(name);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void addEmployee(@RequestBody Person resource) {
        Preconditions.checkNotNull(resource);
        this.personService.addPerson(resource);
    }

    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public void updateEmployee(@RequestBody Person resource) {
        Preconditions.checkNotNull(resource);
        this.personService.updatePerson(resource);
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Person> deleteEmployee(@PathVariable("id") Long id) {
        Person person = this.personService.findById(id);
        if (person == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        this.personService.deletePerson(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
