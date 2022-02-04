package com.simbirsoft.intership.koeshov.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "page")
public class Page extends BaseEntity {

    @Column(name = "url")
    private String url;

    @OneToMany(mappedBy = "page")
    private WordCount wordCount;
}
