package tn.esprit.eyasaidani4cce18.services;

import java.util.List;
import java.util.Optional;
import tn.esprit.eyasaidani4cce18.domain.Agence;

public interface IAgenceService {
    Agence enregistrer(Agence agence);
    List<Agence> lister();
    Optional<Agence> chercherParId(Long id);
    void supprimerParId(Long id);
}
