package org.example.entities.valueObjects;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="catalogue")
public class Catalogue {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private String id;
    private String authorName;
    private int noOfCopies;

    @ManyToMany
    @JoinColumn(name = "id_book")
    private List<Book> book;

}
