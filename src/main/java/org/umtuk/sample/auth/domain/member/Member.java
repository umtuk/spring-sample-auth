package org.umtuk.sample.auth.domain.member;

import java.time.LocalDateTime;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.umtuk.sample.auth.domain.BaseDateDocument;

@Document
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class Member extends BaseDateDocument {

    @Id
    private String id;
    private Set<MemberAuthority> authorities;
    private LocalDateTime lockedExpiredDate;

    public void setLockedExpiredDate(LocalDateTime lockedExpiredDate) {
        this.lockedExpiredDate = lockedExpiredDate;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }
}