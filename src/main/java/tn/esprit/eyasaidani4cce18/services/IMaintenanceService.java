package tn.esprit.eyasaidani4cce18.services;

import java.util.List;
import java.util.Optional;
import tn.esprit.eyasaidani4cce18.domain.Maintenance;

public interface IMaintenanceService {
    Maintenance enregistrer(Maintenance maintenance);
    List<Maintenance> lister();
    Optional<Maintenance> chercherParId(Long id);
    void supprimerParId(Long id);
}
