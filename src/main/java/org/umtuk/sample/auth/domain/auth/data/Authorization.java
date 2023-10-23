package org.umtuk.sample.auth.domain.auth.data;

import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Authorization {

    @Id
    private String id;
    private String registeredClientId;
    private String principalName;
    private String authorizationGrantType;
    @Length(max = 1000)
    private String authorizedScopes;
    @Length(max = 4000)
    private String attributes;
    @Length(max = 500)
    private String state;

    @Length(max = 4000)
    private String authorizationCodeValue;
    private Instant authorizationCodeIssuedAt;
    private Instant authorizationCodeExpiresAt;
    private String authorizationCodeMetadata;

    @Length(max = 4000)
    private String accessTokenValue;
    private Instant accessTokenIssuedAt;
    private Instant accessTokenExpiresAt;
    @Length(max = 2000)
    private String accessTokenMetadata;
    private String accessTokenType;
    @Length(max = 1000)
    private String accessTokenScopes;

    @Length(max = 4000)
    private String refreshTokenValue;
    private Instant refreshTokenIssuedAt;
    private Instant refreshTokenExpiresAt;
    @Length(max = 2000)
    private String refreshTokenMetadata;

    @Length(max = 4000)
    private String oidcIdTokenValue;
    private Instant oidcIdTokenIssuedAt;
    private Instant oidcIdTokenExpiresAt;
    @Length(max = 2000)
    private String oidcIdTokenMetadata;
    @Length(max = 2000)
    private String oidcIdTokenClaims;

    @Length(max = 4000)
    private String userCodeValue;
    private Instant userCodeIssuedAt;
    private Instant userCodeExpiresAt;
    @Length(max = 2000)
    private String userCodeMetadata;

    @Length(max = 4000)
    private String deviceCodeValue;
    private Instant deviceCodeIssuedAt;
    private Instant deviceCodeExpiresAt;
    @Length(max = 2000)
    private String deviceCodeMetadata;
}
