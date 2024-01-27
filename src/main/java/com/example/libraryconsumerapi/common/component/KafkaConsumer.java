package com.example.libraryconsumerapi.common.component;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.example.libraryconsumerapi.reserve.dto.ReserveBookDto;
import com.example.libraryconsumerapi.reserve.service.ReservationService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Component
public class KafkaConsumer {
    private final ObjectMapper objectMapper;
    private final ReservationService reservationService;

    @KafkaListener(topics = "${book.reserve-topic}")
    public void reserveBook(String message) {
        log.info("#### consume reserveBook message= {}", message);
        try {
            ReserveBookDto result = objectMapper.readValue(message, ReserveBookDto.class);
            reservationService.processReservation(result);
        } catch (JsonProcessingException e) {
            log.error("JsonProcessingException 에러가 발생했습니다.", e);

        }
    }
}
