package com.winward.spring_tinyurl.mapper;

import com.winward.spring_tinyurl.dto.UrlDto;
import com.winward.spring_tinyurl.entity.Url;

public class UrlMapper {
    public static UrlDto mapUrlToUrlDto(Url url) {
        return new UrlDto(
            url.getId(),
            url.getLongUrl(),
            url.getShortUrl(),
            url.getCreatedAt()
        );
    }

    public static Url mapUrlDtoToUrl(UrlDto urlDto) {
        return new Url(
            urlDto.getId(),
            urlDto.getLongUrl(),
            urlDto.getShortUrl(),
            urlDto.getCreatedAt()
        );
    }
}
