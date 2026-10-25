package tn.esprit.eyasaidani4cce18.services.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.eyasaidani4cce18.repositories.IClient;
import tn.esprit.eyasaidani4cce18.domain.Client;
import tn.esprit.eyasaidani4cce18.services.IClientService;

@Service
@Transactional(readOnly = true)
public class ClientServiceImpl implements IClientService {

    private final IClient repository;

    public ClientServiceImpl(IClient repository) {
        this.repository = repository;
    }

    // save() permet de créer une entité ou de mettre à jour une entité existante.
    @Override
    @Transactional
    public Client enregistrer(Client client) {
        return repository.save(client);
    }

    @Override
    public List<Client> lister() {
        return repository.findAll();
    }

    @Override
    public Optional<Client> chercherParId(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public void supprimerParId(Long id) {
        repository.deleteById(id);
    }
}
