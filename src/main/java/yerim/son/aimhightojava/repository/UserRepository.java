package yerim.son.aimhightojava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yerim.son.aimhightojava.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
