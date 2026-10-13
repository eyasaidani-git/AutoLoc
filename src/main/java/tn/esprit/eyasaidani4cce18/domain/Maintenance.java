package tn.esprit.eyasaidani4cce18.domain;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "maintenance")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMaintenance;

    private LocalDate dateDebut;

    private LocalDate dateFin;

    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehicule_id")
    private Vehicule vehicule;
}
