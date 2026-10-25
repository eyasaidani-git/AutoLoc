package tn.esprit.eyasaidani4cce18.services.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.eyasaidani4cce18.repositories.IContrat;
import tn.esprit.eyasaidani4cce18.domain.Contrat;
import tn.esprit.eyasaidani4cce18.services.IContratService;

@Service
@Transactional(readOnly = true)
public class ContratServiceImpl implements IContratService {

    private final IContrat repository;

    public ContratServiceImpl(IContrat repository) {
        this.repository = repository;
    }

    // save() permet de créer une entité ou de mettre à jour une entité existante.
    @Override
    @Transactional
    public Contrat enregistrer(Contrat contrat) {
        return repository.save(contrat);
    }

    @Override
    public List<Contrat> lister() {
        return repository.findAll();
    }

    @Override
    public Optional<Contrat> chercherParId(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public void supprimerParId(Long id) {
        repository.deleteById(id);
    }
}
