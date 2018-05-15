package com.usher.springbootintegration.elastic.bean;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @Author: Usher
 * @Description:
 */
@Document(indexName = "es",type = "book")
@Data
public class Book {
    private Integer id;
    private String bookName;
    private String author;

}
