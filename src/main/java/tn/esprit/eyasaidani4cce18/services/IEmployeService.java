package tn.esprit.eyasaidani4cce18.services;

import java.util.List;
import java.util.Optional;
import tn.esprit.eyasaidani4cce18.domain.Employe;

public interface IEmployeService {
    Employe enregistrer(Employe employe);
    List<Employe> lister();
    Optional<Employe> chercherParId(Long id);
    void supprimerParId(Long id);
}
