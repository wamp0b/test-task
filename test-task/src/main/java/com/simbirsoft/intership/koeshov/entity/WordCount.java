package com.simbirsoft.intership.koeshov.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "word_count")
public class WordCount {

    @Column(name = "word")
    private String word;

    @Column(name = "count")
    private Integer count;

    @ManyToOne
    @JoinColumn(name = "page_id", nullable = false)
    private Page page;
}
