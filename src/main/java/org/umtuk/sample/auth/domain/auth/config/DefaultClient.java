package org.umtuk.sample.auth.domain.auth.config;

import java.util.Set;
import org.springframework.boot.context.properties.ConfigurationProperties;
@ConfigurationProperties(value = "spring.security.oauth2.authorizationserver.client.default.registration")
public record DefaultClient(
    String clientId,
    String clientSecret,
    Set<String> clientAuthenticationMethods,
    Set<String> authorizationGrantTypes,
    Set<String> redirectUris,
    Set<String> postLogoutRedirectUris,
    Set<String> scopes
) {
}
