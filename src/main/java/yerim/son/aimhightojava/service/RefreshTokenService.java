package yerim.son.aimhightojava.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import yerim.son.aimhightojava.domain.RefreshToken;
import yerim.son.aimhightojava.repository.RefreshTokenRepository;

@RequiredArgsConstructor
@Service
public class RefreshTokenService {
    private final RefreshTokenRepository refreshTokenRepository;

    public RefreshToken findByRefreshToken(String refreshToken) {
        return refreshTokenRepository.findByRefreshToken(refreshToken)
                .orElseThrow(() -> new IllegalArgumentException("Unexpected token"));
    }
}