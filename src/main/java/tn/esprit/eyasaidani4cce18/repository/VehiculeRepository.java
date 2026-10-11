package tn.esprit.eyasaidani4cce18.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.eyasaidani4cce18.domain.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {
    boolean existsByImmatriculation(String immatriculation);
}
