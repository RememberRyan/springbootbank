package sda.springbootbank.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;


/**
 * Created by Ryan Alexander on 22/11/2018.
 */
@Entity
@Data
//all argument constructors
@AllArgsConstructor
//empty constructors
@NoArgsConstructor

public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "currency")
    private String currency;

    @Column (name ="balance")
    private BigDecimal balance; // https://stackoverflow.com/a/8148773

    // foreign key implementation??
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private User user;
}
