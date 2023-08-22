package org.example.entities.valueObjects;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
@Table(name="member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)

    private String id;
    private int password;

    @OneToMany
    @JoinColumn(name = "id_book")
    private List<Book> book;
}
