package com.winward.spring_tinyurl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.winward.spring_tinyurl.entity.Click;
import com.winward.spring_tinyurl.entity.Url;

public interface ClickRepository extends JpaRepository<Click, Long> {
    long countByUrlId(Url url);

    List<Click> findByUrlId_Id(Long urlId);
}
