package tn.esprit.eyasaidani4cce18.services.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.eyasaidani4cce18.repositories.IMaintenanceRepository;
import tn.esprit.eyasaidani4cce18.domain.Maintenance;
import tn.esprit.eyasaidani4cce18.services.IMaintenanceService;

@Service
@Transactional(readOnly = true)
public class MaintenanceServiceImpl implements IMaintenanceService {

    private final IMaintenanceRepository repository;

    public MaintenanceServiceImpl(IMaintenanceRepository repository) {
        this.repository = repository;
    }

    // save() permet de créer une entité ou de mettre à jour une entité existante.
    @Override
    @Transactional
    public Maintenance enregistrer(Maintenance maintenance) {
        return repository.save(maintenance);
    }

    @Override
    public List<Maintenance> lister() {
        return repository.findAll();
    }

    @Override
    public Optional<Maintenance> chercherParId(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public void supprimerParId(Long id) {
        repository.deleteById(id);
    }
}
