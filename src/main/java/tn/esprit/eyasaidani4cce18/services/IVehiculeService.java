package tn.esprit.eyasaidani4cce18.services;

import java.util.List;
import java.util.Optional;
import tn.esprit.eyasaidani4cce18.domain.Vehicule;

public interface IVehiculeService {
    Vehicule enregistrer(Vehicule vehicule);
    List<Vehicule> lister();
    Optional<Vehicule> chercherParId(Long id);
    void supprimerParId(Long id);
}