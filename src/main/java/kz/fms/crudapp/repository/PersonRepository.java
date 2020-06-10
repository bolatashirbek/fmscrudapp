package kz.fms.crudapp.repository;

import kz.fms.crudapp.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Bolat Ashirbek on 08.06.2020.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findByFirstName(String firstName);
}
