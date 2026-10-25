package tn.esprit.eyasaidani4cce18.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.eyasaidani4cce18.domain.Client;

public interface IClient extends JpaRepository<Client, Long> {}