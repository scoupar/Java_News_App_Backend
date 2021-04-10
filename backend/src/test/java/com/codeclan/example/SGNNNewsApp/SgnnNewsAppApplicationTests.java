package com.codeclan.example.SGNNNewsApp;

import com.codeclan.example.SGNNNewsApp.model.Article;
import com.codeclan.example.SGNNNewsApp.repository.ArticleRepository;
import com.codeclan.example.SGNNNewsApp.repository.JournalistRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class SgnnNewsAppApplicationTests {

	@Autowired
	JournalistRepository journalistRepository;

	@Autowired
	ArticleRepository articleRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void findArticleByDate(){
		List<Article> found= articleRepository.findArticlesByDate(LocalDate.of(2021, 03,10));
		assertEquals(1, found.size());
	}


}
