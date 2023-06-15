package sk.pavlovsky.ecasenka.modul;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = true)
    private String name;
}
