package tn.esprit.eyasaidani4cce18.services.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.eyasaidani4cce18.repositories.IReservationRepository;
import tn.esprit.eyasaidani4cce18.domain.Reservation;
import tn.esprit.eyasaidani4cce18.services.IReservationService;

@Service
@Transactional(readOnly = true)
public class ReservationServiceImpl implements IReservationService {

    private final IReservationRepository repository;

    public ReservationServiceImpl(IReservationRepository repository) {
        this.repository = repository;
    }

    // save() permet de créer une entité ou de mettre à jour une entité existante.
    @Override
    @Transactional
    public Reservation enregistrer(Reservation reservation) {
        return repository.save(reservation);
    }

    @Override
    public List<Reservation> lister() {
        return repository.findAll();
    }

    @Override
    public Optional<Reservation> chercherParId(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public void supprimerParId(Long id) {
        repository.deleteById(id);
    }
}
