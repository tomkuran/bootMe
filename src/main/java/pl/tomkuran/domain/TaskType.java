package pl.tomkuran.domain;

import javax.persistence.*;

/**
 * Created by TKURAN on 3/21/2016.
 */
@Entity
public class TaskType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String type;

}
