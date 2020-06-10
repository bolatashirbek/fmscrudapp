package kz.fms.crudapp.rest;

import kz.fms.crudapp.model.Region;
import kz.fms.crudapp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Bolat Ashirbek on 10.06.2020.
 */

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/regions")
public class RegionRestController {

    private final PersonService personService;

    @Autowired
    public RegionRestController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Region>> getRoles() {
        List<Region> regions = this.personService.getAllRegion();
        if (regions.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(regions, HttpStatus.OK);
    }
}
