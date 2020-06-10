package kz.fms.crudapp.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Bolat Ashirbek on 08.06.2020.
 */

@Data
@Entity
@Table(name = "regions")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
}
