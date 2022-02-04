package com.simbirsoft.intership.koeshov.repository;

import com.simbirsoft.intership.koeshov.entity.WordCount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordCountRepository extends JpaRepository<WordCount, Long> {
}
