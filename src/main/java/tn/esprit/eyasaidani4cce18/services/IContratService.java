package tn.esprit.eyasaidani4cce18.services;

import java.util.List;
import java.util.Optional;
import tn.esprit.eyasaidani4cce18.domain.Contrat;

public interface IContratService {
    Contrat enregistrer(Contrat contrat);
    List<Contrat> lister();
    Optional<Contrat> chercherParId(Long id);
    void supprimerParId(Long id);
}
