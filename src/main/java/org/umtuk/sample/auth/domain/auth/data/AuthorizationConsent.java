package org.umtuk.sample.auth.domain.auth.data;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
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
public class AuthorizationConsent {

    @Id
    private AuthorizationConsentId id;
    @Length(max = 1000)
    private String authorities;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    @EqualsAndHashCode
    public static class AuthorizationConsentId {
        private String registeredClientId;
        private String principalName;
    }
}
