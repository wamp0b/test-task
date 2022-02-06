package com.simbirsoft.intership.koeshov.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "word_count")
public class WordCount extends BaseEntity{

    @Column(name = "word")
    private String word;

    @Column(name = "count")
    private Integer count;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "page_id", nullable = false)
    @JsonIgnore
    private Page page;
}
