package org.umtuk.sample.auth.domain.auth.data;

import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Client {

    @Id
    private String id;
    @Indexed(unique = true)
    private String clientId;
    private Instant clientIdIssuedAt;
    private String clientSecret;
    private Instant clientSecretExpiresAt;
    private String clientName;
    @Length(max = 1000)
    private String clientAuthenticationMethods;
    @Length(max = 1000)
    private String authorizationGrantTypes;
    @Length(max = 1000)
    private String redirectUris;
    @Length(max = 1000)
    private String postLogoutRedirectUris;
    @Length(max = 1000)
    private String scopes;
    @Length(max = 2000)
    private String clientSettings;
    @Length(max = 2000)
    private String tokenSettings;
}
