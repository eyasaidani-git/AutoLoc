package tn.esprit.eyasaidani4cce18.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "client")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;

    private String nom;

    private String prenom;

    private String email;

    private String telephone;

    private String numPermis;

    private LocalDate dateInscription;

    @ToString.Exclude
    @OneToMany(mappedBy = "client", cascade = CascadeType.PERSIST)
    private List<Reservation> reservations = new ArrayList<>();
}
