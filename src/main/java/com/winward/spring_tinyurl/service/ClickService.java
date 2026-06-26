package com.winward.spring_tinyurl.service;

import java.util.List;

import com.winward.spring_tinyurl.dto.ClickDto;

public interface ClickService {
    ClickDto createClickRecord(ClickDto clickDto);
    void incrementClickCount(ClickDto clickDto);
    int getClickCount(ClickDto clickDto);
    List<ClickDto> getUrlClickDetails(Long clickId);
}
