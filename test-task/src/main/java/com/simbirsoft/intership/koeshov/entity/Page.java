package com.simbirsoft.intership.koeshov.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "page")
@AllArgsConstructor
@NoArgsConstructor
public class Page extends BaseEntity {

    @Column(name = "url")
    private String url;

    @OneToMany(mappedBy = "page", cascade = CascadeType.PERSIST, orphanRemoval = true)
    private List<WordCount> wordCounts = new ArrayList<>();
}
