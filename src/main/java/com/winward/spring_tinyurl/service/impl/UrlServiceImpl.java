package com.winward.spring_tinyurl.service.impl;

import org.springframework.stereotype.Service;

import com.winward.spring_tinyurl.dto.UrlDto;
import com.winward.spring_tinyurl.entity.Url;
import com.winward.spring_tinyurl.mapper.UrlMapper;
import com.winward.spring_tinyurl.repository.UrlRepository;
import com.winward.spring_tinyurl.service.UrlService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UrlServiceImpl implements UrlService {
    private final UrlRepository urlRepository;

    @Override
    public UrlDto createShortUrl(UrlDto urlDto) {
        Url url = UrlMapper.mapUrlDtoToUrl(urlDto);
        Url savedUrl = urlRepository.save(url);
        return UrlMapper.mapUrlToUrlDto(savedUrl);
    }

    @Override
    public UrlDto getLongUrlByShortUrl(String shortUrl) {
        Url url = urlRepository.findByShortUrl(shortUrl);
        if (url == null) {
            return null;
        }

        return UrlMapper.mapUrlToUrlDto(url);
    }

    @Override
    public void deleteUrl(Long urlId) {
        Url existingUrl = urlRepository.findById(urlId)
            .orElseThrow(() -> new RuntimeException("URL not found with id: " + urlId));
        urlRepository.delete(existingUrl);
    }
}
