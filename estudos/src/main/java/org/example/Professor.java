package org.example;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "professor")
public class Professor {
    @ToString.Include
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private int salary;
    private int staffNumber;
    private int yearsOfService;
    private int numberOfClasses;

    @OneToMany(mappedBy = "professor", orphanRemoval = true)
    private List<Address> address;
}
