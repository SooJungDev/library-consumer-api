package com.example.libraryconsumerapi.common.component;

import org.springframework.stereotype.Service;

import com.example.libraryconsumerapi.common.dto.SlackMessageRequest;
import com.example.libraryconsumerapi.common.openfeign.SlackOpenFeign;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class SlackMessage {
    private final SlackOpenFeign slackOpenFeign;

    public void send(SlackMessageRequest request) {
        slackOpenFeign.sedMessage(request);
    }
}
