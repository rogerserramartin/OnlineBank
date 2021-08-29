package com.rogerserra.awesomeonlinebank.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table
@Getter @Setter @NoArgsConstructor // LOMBOK
public class User implements Serializable {
    // Serialization allows us to convert the state of an object into a byte stream,
    // which then can be saved into a file on the local disk or sent over the network to any other machine.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    @Transient //this means that there is no reason for age to be a column in our table
    private Integer age;

    public User(String name, String email, String address, String phoneNumber, LocalDate dateOfBirth) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }
}
