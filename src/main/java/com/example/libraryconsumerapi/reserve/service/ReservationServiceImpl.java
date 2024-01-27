package com.example.libraryconsumerapi.reserve.service;

import org.springframework.stereotype.Service;

import com.example.libraryconsumerapi.common.component.SlackMessage;
import com.example.libraryconsumerapi.common.dto.SlackMessageRequest;
import com.example.libraryconsumerapi.reserve.dto.ReserveBookDto;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class ReservationServiceImpl implements ReservationService {

    private final SlackMessage slackMessage;

    @Override
    public void processReservation(ReserveBookDto bookDto) {
        slackMessage.send(getSlackMessageRequest(bookDto));
    }

    private static SlackMessageRequest getSlackMessageRequest(ReserveBookDto bookDto) {
        return new SlackMessageRequest("[Library API] 도서 예약 주문 알람입니다.",
                                       "#36a64f",
                                       bookDto.getSlackTitle(),
                                       bookDto.getSlackMessage());
    }
}
