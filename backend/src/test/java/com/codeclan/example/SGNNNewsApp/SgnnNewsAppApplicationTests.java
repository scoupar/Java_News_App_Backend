package com.codeclan.example.SGNNNewsApp;

import com.codeclan.example.SGNNNewsApp.repository.ArticleRepository;
import com.codeclan.example.SGNNNewsApp.repository.JournalistRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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

}
