package kz.fms.crudapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bolat Ashirbek on 10.06.2020.
 */

@RestController
@RequestMapping("/")
public class MainRestController {

    @GetMapping
    public String greeting() {
        return "This is FMS Spring Boot Appliction!";
    }

}
