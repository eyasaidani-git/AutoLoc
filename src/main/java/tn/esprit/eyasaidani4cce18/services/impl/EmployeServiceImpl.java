package tn.esprit.eyasaidani4cce18.services.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.eyasaidani4cce18.repositories.IEmployeRepository;
import tn.esprit.eyasaidani4cce18.domain.Employe;
import tn.esprit.eyasaidani4cce18.services.IEmployeService;

@Service
@Transactional(readOnly = true)
public class EmployeServiceImpl implements IEmployeService {

    private final IEmployeRepository repository;

    public EmployeServiceImpl(IEmployeRepository repository) {
        this.repository = repository;
    }

    // save() permet de créer une entité ou de mettre à jour une entité existante.
    @Override
    @Transactional
    public Employe enregistrer(Employe employe) {
        return repository.save(employe);
    }

    @Override
    public List<Employe> lister() {
        return repository.findAll();
    }

    @Override
    public Optional<Employe> chercherParId(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public void supprimerParId(Long id) {
        repository.deleteById(id);
    }
}
