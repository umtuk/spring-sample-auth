package org.umtuk.sample.auth.domain.auth.repository;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.umtuk.sample.auth.domain.auth.data.Authorization;

public interface AuthorizationRepository extends MongoRepository<Authorization, String> {

    Optional<Authorization> findByState(String state);
    Optional<Authorization> findByAuthorizationCodeValue(String authorizationCode);
    Optional<Authorization> findByAccessTokenValue(String accessToken);
    Optional<Authorization> findByRefreshTokenValue(String refreshToken);
    Optional<Authorization> findByOidcIdTokenValue(String idToken);
    Optional<Authorization> findByUserCodeValue(String userCode);
    Optional<Authorization> findByDeviceCodeValue(String deviceCode);
    @Query("{ $or: [{ 'state': ?0 }, "
        + "{ 'authorizationCodeValue': ?0 }, "
        + "{ 'accessTokenValue': ?0 }, "
        + "{ 'refreshTokenValue': ?0 }, "
        + "{ 'oidcIdTokenValue': ?0 }, "
        + "{ 'userCodeValue': ?0 }, "
        + "{ 'deviceCodeValue': ?0 }] }")
    Optional<Authorization> findByStateOrAuthorizationCodeValueOrAccessTokenValueOrRefreshTokenValueOrOidcIdTokenValueOrUserCodeValueOrDeviceCodeValue(String token);
}
