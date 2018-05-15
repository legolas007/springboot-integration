package com.usher.springbootintegration.elastic.repository;

import com.usher.springbootintegration.elastic.bean.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @Author: Usher
 * @Description:
 */
public interface BookRepository extends ElasticsearchRepository<Book,Integer>{

    List<Book> findByBookNameLike(String bookName);
}
