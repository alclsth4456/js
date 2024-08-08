package com.demo.demo.controller;

import com.demo.demo.dto.ArticleForm;
import com.demo.demo.entity.Article;
import com.demo.demo.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Slf4j//컨트롤러에 로그 남기기 데이터를 검증하면 기록에남고 출력하여 볼 수 있다.
@Controller
public class ArticleController {

   @Autowired
    private  ArticleRepository articleRepository;


    @GetMapping("/articles/new")// 폼데이터를 입력하는 페이지
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping("/articles/create")  //게시글 dto에 담는 페이지
    public String createArticle(ArticleForm form) {
//        System.out.println(form.toString());
        log.info(form.toString());
        //1.DTO를 엔티티로 변환
        Article article = form.toEntity();
        log.info(article.toString());
        //2.레파지토리로 엔티티를 DB에 저장
        Article saved = articleRepository.save(article);
        log.info(saved.toString());
        return "redirect:/articles/"+saved.getId();  
    }
;
    @GetMapping("/articles/{id}")
    public String show(@PathVariable Long id, Model model) {
        log.info("id=" +id);  //로깅 코드 추가
        //1.id를 조회해 데이터 가져오기
        Article articleEntity = articleRepository.findById(id).orElse(null);
//        Optional<Article> article = articleRepository.findById(id).orElse(null);

        //2.모델에 데이터 등록하기
        model.addAttribute("article", articleEntity);

        //3.뷰 페이지 반환하기
        return "articles/show";
    }

    @GetMapping("/articles")
    public String index(Model model) {
        //1.모든 데이터 가져오기
        ArrayList<Article> articleEntityList = (ArrayList<Article>) articleRepository.findAll();

        //2.모델에 데이터 등록하기
        model.addAttribute("articleList", articleEntityList);

        //3.뷰 페이지 설정하기
        return "articles/index";
    }

}
