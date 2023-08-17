package org.example.entities.valueObjects;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name="address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)

    private Long id;
    private String street;
    private String city;
    private String state;
    private int postalCode;
    private String country;

    @ManyToOne
    @JoinColumn(name = "studante_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;


}
