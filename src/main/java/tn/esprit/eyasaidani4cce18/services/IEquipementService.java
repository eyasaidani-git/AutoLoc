package tn.esprit.eyasaidani4cce18.services;

import java.util.List;
import java.util.Optional;
import tn.esprit.eyasaidani4cce18.domain.Equipement;

public interface IEquipementService {
    Equipement enregistrer(Equipement equipement);
    List<Equipement> lister();
    Optional<Equipement> chercherParId(Long id);
    void supprimerParId(Long id);
}
