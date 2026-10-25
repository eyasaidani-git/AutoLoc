package tn.esprit.eyasaidani4cce18.services;

import java.util.List;
import java.util.Optional;
import tn.esprit.eyasaidani4cce18.domain.Paiement;

public interface IPaiementService {
    Paiement enregistrer(Paiement paiement);
    List<Paiement> lister();
    Optional<Paiement> chercherParId(Long id);
    void supprimerParId(Long id);
}
