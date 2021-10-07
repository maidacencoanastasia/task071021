package maidacenco.test.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name_s", nullable = false)
    private String name;

    @Column(name = "groupa", nullable = false)
    private String group;

    @Column(name = "average_of_Marks", nullable = true)
    private float averageMark;
}
