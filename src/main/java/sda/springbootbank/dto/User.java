package sda.springbootbank.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by Ryan Alexander on 21/11/2018.
 */
@Entity
@Data
//all argument constructors
@AllArgsConstructor
//empty constructors
@NoArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column (name ="surname")
    private String surname;
    @Column (name ="dob")
    private LocalDate dob; // https://stackoverflow.com/questions/36336826/what-java-data-type-will-date-of-birth-be#comment60299383_36337120
    @Column (name="nationality")
    private String nationality;
    @Column (name="account_num")
    private int account_num; // Viktor advises  this type is incorrect

    // foreign key implementation?
    @OneToOne(mappedBy = "user")
    private Account account;
}