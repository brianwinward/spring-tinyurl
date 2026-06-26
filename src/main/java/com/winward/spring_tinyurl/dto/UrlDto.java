package com.winward.spring_tinyurl.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UrlDto {
    private Long id;
    private String longUrl;
    private String shortUrl;
    private LocalDateTime createdAt;
}
