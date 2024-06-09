package yerim.son.aimhightojava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yerim.son.aimhightojava.domain.RefreshToken;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshToken> findByUserId(Long userId);
    Optional<RefreshToken> findByRefreshToken(String refreshToken);
}
