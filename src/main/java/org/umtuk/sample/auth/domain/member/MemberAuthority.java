package org.umtuk.sample.auth.domain.member;

import org.springframework.security.core.GrantedAuthority;

public enum MemberAuthority implements GrantedAuthority {
    USER("ROLE_USER"),
    ROOT_ADMIN("ROLE_ROOT_ADMIN"),
    ADMIN("ROLE_ADMIN"),
    ;

    private final String label;
    MemberAuthority(String label) {
        this.label = label;
    }
    @Override
    public String getAuthority() {
        return label;
    }
}
