package org.umtuk.sample.auth.domain.auth.repository;

import java.util.Optional;
import org.springframework.data.mongodb.repository.DeleteQuery;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import org.umtuk.sample.auth.domain.auth.data.AuthorizationConsent;
import org.umtuk.sample.auth.domain.auth.data.AuthorizationConsent.AuthorizationConsentId;

@Repository
public interface AuthorizationConsentRepository extends MongoRepository<AuthorizationConsent, AuthorizationConsentId> {
    @Query("{ 'id.registeredClientId': ?0, 'id.principalName': ?1 }")
    Optional<AuthorizationConsent> findByRegisteredClientIdAndPrincipalName(String registeredClientId, String principalName);
    @DeleteQuery("{ 'id.registeredClientId': ?0, 'id.principalName': ?1 }")
    void deleteByRegisteredClientIdAndPrincipalName(String registeredClientId, String principalName);
}
