package com.usher.springbootintegration.mq.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Usher
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String bookName;
    private String author;

}
