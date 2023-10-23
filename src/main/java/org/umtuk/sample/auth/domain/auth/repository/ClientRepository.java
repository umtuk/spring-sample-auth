package org.umtuk.sample.auth.domain.auth.repository;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.umtuk.sample.auth.domain.auth.data.Client;

public interface ClientRepository extends MongoRepository<Client, String> {

    Optional<Client> findByClientId(String clientId);
    boolean existsByClientId(String clientId);
}
