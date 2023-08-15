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
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private int studentNumber;
    private int averageMark;

    @OneToMany(mappedBy = "student", orphanRemoval = true)
    private List<Address> address;
}
