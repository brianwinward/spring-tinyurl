package com.winward.spring_tinyurl.service;

import com.winward.spring_tinyurl.dto.UrlDto;

public interface UrlService {
    UrlDto createShortUrl(UrlDto urlDto);
    UrlDto getLongUrlByShortUrl(String shortUrl);
    void deleteUrl(Long urlId);
}
