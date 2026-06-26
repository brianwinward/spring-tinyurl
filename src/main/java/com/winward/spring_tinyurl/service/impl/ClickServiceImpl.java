package com.winward.spring_tinyurl.service.impl;

import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.winward.spring_tinyurl.dto.ClickDto;
import com.winward.spring_tinyurl.entity.Click;
import com.winward.spring_tinyurl.mapper.ClickMapper;
import com.winward.spring_tinyurl.repository.ClickRepository;
import com.winward.spring_tinyurl.service.ClickService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ClickServiceImpl implements ClickService {
    private final ClickRepository clickRepository;

    @Override
    public ClickDto createClickRecord(ClickDto clickDto) {
        Click click = ClickMapper.mapAnalyticsDtoToAnalytics(clickDto);
        Click savedClick = clickRepository.save(click);
        return ClickMapper.mapAnalyticsToAnalyticsDto(savedClick);
    }

    @Override
    public void incrementClickCount(ClickDto clickDto) {
        Click click = ClickMapper.mapAnalyticsDtoToAnalytics(clickDto);
        clickRepository.save(click);
    }

    @Override
    public int getClickCount(ClickDto clickDto) {
        return Math.toIntExact(clickRepository.countByUrlId(clickDto.getUrlId()));
    }

    @Override
    public List<ClickDto> getUrlClickDetails(Long clickId) {
        return clickRepository.findByUrlId_Id(clickId).stream()
            .map(ClickMapper::mapAnalyticsToAnalyticsDto)
            .collect(Collectors.toList());
    }
}
