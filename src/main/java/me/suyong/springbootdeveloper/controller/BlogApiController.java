package me.suyong.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import me.suyong.springbootdeveloper.domain.Article;
import me.suyong.springbootdeveloper.dto.AddArticleRequest;
import me.suyong.springbootdeveloper.service.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BlogApiController {

    private final BlogService blogService;

    // HTTP 메서드가 POST일 때 전달받은 URL과 동일하면 메서드로 매핑
    @PostMapping("/api/articles")
    // Request Body로 요청 본문 값 매핑
    public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequest request){
        Article savedAriticle = blogService.save(request);

        // 요청된 자원이 성공적으로 생성되었으며 저장된 블로그 글 정보를 응답 객체에 담아 전송
        return  ResponseEntity.status(HttpStatus.CREATED)
                .body(savedAriticle);
    }
}
