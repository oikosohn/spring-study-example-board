package com.study.board.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// JPA가 이하를 읽고 처리함
@Entity // DB 테이블 의미
@Data // getContent() 사용 가능
public class Board {
    @Id // Primary Key 의미
    @GeneratedValue(strategy = GenerationType.IDENTITY) // MySQL, MariaDB
    private Integer id;
    private String title;
    private String content;

    private String filename;

    private String filepath;
}
