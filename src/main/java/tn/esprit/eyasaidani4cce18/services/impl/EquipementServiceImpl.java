package tn.esprit.eyasaidani4cce18.services.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.eyasaidani4cce18.repositories.IEquipementRepository;
import tn.esprit.eyasaidani4cce18.domain.Equipement;
import tn.esprit.eyasaidani4cce18.services.IEquipementService;

@Service
@Transactional(readOnly = true)
public class EquipementServiceImpl implements IEquipementService {

    private final IEquipementRepository repository;

    public EquipementServiceImpl(IEquipementRepository repository) {
        this.repository = repository;
    }

    // save() permet de créer une entité ou de mettre à jour une entité existante.
    @Override
    @Transactional
    public Equipement enregistrer(Equipement equipement) {
        return repository.save(equipement);
    }

    @Override
    public List<Equipement> lister() {
        return repository.findAll();
    }

    @Override
    public Optional<Equipement> chercherParId(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public void supprimerParId(Long id) {
        repository.deleteById(id);
    }
}
