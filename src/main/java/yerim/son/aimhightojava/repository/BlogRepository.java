package yerim.son.aimhightojava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yerim.son.aimhightojava.domain.Article;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
