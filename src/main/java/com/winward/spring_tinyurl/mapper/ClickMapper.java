package com.winward.spring_tinyurl.mapper;

import com.winward.spring_tinyurl.dto.ClickDto;
import com.winward.spring_tinyurl.entity.Click;

public class ClickMapper {
    public static ClickDto mapAnalyticsToAnalyticsDto(Click click) {
        return new ClickDto(
            click.getId(),
            click.getUrlId(),
            click.getClickedAt(),
            click.getIpAddress(),
            click.getCountry(),
            click.getReferrer(),
            click.getUserAgent()
        );
    }

    public static Click mapAnalyticsDtoToAnalytics(ClickDto clickDto) {
        return new Click(
            clickDto.getId(),
            clickDto.getUrlId(),
            clickDto.getClickedAt(),
            clickDto.getIpAddress(),
            clickDto.getCountry(),
            clickDto.getReferrer(),
            clickDto.getUserAgent()
        );
    }
}
