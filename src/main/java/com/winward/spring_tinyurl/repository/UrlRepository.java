package com.winward.spring_tinyurl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.winward.spring_tinyurl.entity.Url;

public interface UrlRepository extends JpaRepository<Url, Long> {
    Url findByShortUrl(String shortUrl);
}
