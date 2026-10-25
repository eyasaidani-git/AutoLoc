package tn.esprit.eyasaidani4cce18.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.eyasaidani4cce18.domain.Vehicule;

public interface IVehiculeRepository
        extends JpaRepository<Vehicule, Long> {

    boolean existsByImmatriculation(String immatriculation);
}