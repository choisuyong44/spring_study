package me.suyong.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.suyong.springbootdeveloper.domain.Article;
import me.suyong.springbootdeveloper.dto.AddArticleRequest;
import me.suyong.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    // 블로그 글 추가 메서드
    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }
}
