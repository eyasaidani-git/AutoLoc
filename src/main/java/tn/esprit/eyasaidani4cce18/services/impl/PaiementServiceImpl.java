package tn.esprit.eyasaidani4cce18.services.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.eyasaidani4cce18.repositories.IPaiementRepository;
import tn.esprit.eyasaidani4cce18.domain.Paiement;
import tn.esprit.eyasaidani4cce18.services.IPaiementService;

@Service
@Transactional(readOnly = true)
public class PaiementServiceImpl implements IPaiementService {

    private final IPaiementRepository repository;

    public PaiementServiceImpl(IPaiementRepository repository) {
        this.repository = repository;
    }

    // save() permet de créer une entité ou de mettre à jour une entité existante.
    @Override
    @Transactional
    public Paiement enregistrer(Paiement paiement) {
        return repository.save(paiement);
    }

    @Override
    public List<Paiement> lister() {
        return repository.findAll();
    }

    @Override
    public Optional<Paiement> chercherParId(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public void supprimerParId(Long id) {
        repository.deleteById(id);
    }
}
