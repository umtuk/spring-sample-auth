package org.umtuk.sample.auth.domain.member;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository repository;

    public Member details(String id) {
        return repository.findById(id).orElseThrow();
    }

    @Transactional
    public Member addAuthority(String id, MemberAuthority authority) {
        Member member = details(id);
        member.getAuthorities().add(authority);
        return repository.save(member);
    }

    @Transactional
    public Member addAuthorities(String id, Set<MemberAuthority> authorities) {
        Member member = details(id);
        member.getAuthorities().addAll(authorities);
        return repository.save(member);
    }

    @Transactional
    public Member lock(String id, Duration duration) {
        Member member = details(id);
        member.setLockedExpiredDate(LocalDateTime.now().plus(duration));
        return repository.save(member);
    }

    @Transactional
    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Member not found");
        }
        repository.deleteById(id);
    }
}
