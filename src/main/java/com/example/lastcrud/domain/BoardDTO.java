package com.example.lastcrud.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BoardDTO {
    private Long idx;

    private String title;

    private String content;

    private String writer;

    private int viewContent;

    private LocalDateTime insertTime;

    private LocalDateTime updateTime;
}
