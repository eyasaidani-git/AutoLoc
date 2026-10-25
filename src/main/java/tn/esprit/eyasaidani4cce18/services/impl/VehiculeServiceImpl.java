package tn.esprit.eyasaidani4cce18.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.eyasaidani4cce18.repositories.IVehiculeRepository;
import tn.esprit.eyasaidani4cce18.domain.Vehicule;
import tn.esprit.eyasaidani4cce18.services.IVehiculeService;

@Service
@Transactional(readOnly = true)
public class VehiculeServiceImpl implements IVehiculeService {

    private final IVehiculeRepository repository;

    public VehiculeServiceImpl(IVehiculeRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public Vehicule enregistrer(Vehicule vehicule) {
        return repository.save(vehicule);
    }

    @Override
    public List<Vehicule> lister() {
        return repository.findAll();
    }

    @Override
    public Optional<Vehicule> chercherParId(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public void supprimerParId(Long id) {
        repository.deleteById(id);
    }
}