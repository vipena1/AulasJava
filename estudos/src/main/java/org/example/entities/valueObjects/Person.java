package org.example.entities.valueObjects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
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
    private String phoneNumber;
    @Column (name = "emailAddress")
    private String emailAddress;
}
