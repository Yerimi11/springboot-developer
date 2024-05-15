package yerim.son.aimhightojava.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import yerim.son.aimhightojava.domain.Article;
import yerim.son.aimhightojava.dto.AddArticleRequest;
import yerim.son.aimhightojava.repository.BlogRepository;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
