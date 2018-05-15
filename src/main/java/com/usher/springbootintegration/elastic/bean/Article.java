package com.usher.springbootintegration.elastic.bean;

import io.searchbox.annotations.JestId;
import lombok.Data;

/**
 * @Author: Usher
 * @Description:
 */
@Data
public class Article {
    @JestId
    private Integer id;
    private String author;
    private String title;
    private String content;

}
