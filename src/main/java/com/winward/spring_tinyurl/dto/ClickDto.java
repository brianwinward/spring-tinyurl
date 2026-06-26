package com.winward.spring_tinyurl.dto;

import java.time.LocalDateTime;

import com.winward.spring_tinyurl.entity.Url;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClickDto {
    private Long id;
    private Url urlId;
    private LocalDateTime clickedAt;
    private String ipAddress;
    private String country;
    private String referrer;
    private String userAgent;
}
