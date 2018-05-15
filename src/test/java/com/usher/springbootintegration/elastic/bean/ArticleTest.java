package com.usher.springbootintegration.elastic.bean;

import io.searchbox.client.JestClient;

import io.searchbox.core.Index;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * @Author: Usher
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleTest {

    @Autowired
    private JestClient jestClient;

    @Test
    public void jest(){
        Article article = new Article();
        article.setId(2);
        article.setAuthor("usher");
        article.setContent("hello");
        article.setTitle("good news");

        Index index = new Index.Builder(article).index("es").type("news").build();
        try {
            jestClient.execute(index);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}