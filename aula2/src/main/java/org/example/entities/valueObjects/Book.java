package org.example.entities.valueObjects;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
@Table(name="book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)

    private String id;
    private String nameOfBook;
    private String authorName;
    private int noOfBooks;
    private String isdnNo;
    private String subject;

    @ManyToMany
    @JoinColumn(name = "id_catalog")
    private List<Catalogue> catalogue;

    @ManyToOne
    @JoinColumn(name = "id_staff")
    private Staff staff;

    @ManyToOne
    @JoinColumn(name = "id_member")
    private Member member;

}
