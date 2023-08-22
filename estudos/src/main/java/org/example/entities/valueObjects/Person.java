package org.example.entities.valueObjects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Person {

    @Column (name = "name")
    private String name;
    @Column (name = "phoneNumber")
    @Embedded
    private Phone phoneNumber;
    @Column (name = "emailAddress")
    private String emailAddress;
}
