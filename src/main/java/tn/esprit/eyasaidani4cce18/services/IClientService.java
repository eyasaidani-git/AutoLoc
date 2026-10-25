package tn.esprit.eyasaidani4cce18.services;

import java.util.List;
import java.util.Optional;
import tn.esprit.eyasaidani4cce18.domain.Client;

public interface IClientService {
    Client enregistrer(Client client);
    List<Client> lister();
    Optional<Client> chercherParId(Long id);
    void supprimerParId(Long id);
}
