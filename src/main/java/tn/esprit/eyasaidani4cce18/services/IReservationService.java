package tn.esprit.eyasaidani4cce18.services;

import java.util.List;
import java.util.Optional;
import tn.esprit.eyasaidani4cce18.domain.Reservation;

public interface IReservationService {
    Reservation enregistrer(Reservation reservation);
    List<Reservation> lister();
    Optional<Reservation> chercherParId(Long id);
    void supprimerParId(Long id);
}
