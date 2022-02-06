package com.simbirsoft.intership.koeshov.repository;

import com.simbirsoft.intership.koeshov.entity.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PageRepository extends JpaRepository <Page,Long> {
}
