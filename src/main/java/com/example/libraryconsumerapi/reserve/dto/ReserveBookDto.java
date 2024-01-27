package com.example.libraryconsumerapi.reserve.dto;

import lombok.Data;

@Data
public class ReserveBookDto {
    private Long id;

    private String title;

    private int quantity;

    public String getSlackTitle() {
        return String.format("%s 책이 주문되었습니다.", title);
    }

    public String getSlackMessage() {
        return String.format("책 제목: %s, \n 주문 수량: %d", title, quantity);
    }
}
