package com.example.libraryconsumerapi.common.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.libraryconsumerapi.common.dto.SlackMessageRequest;

@FeignClient(name = "SlackOpenFeign", url = "${slack.webhook-url}")
public interface SlackOpenFeign {

    @PostMapping
    String sedMessage(SlackMessageRequest payload);
}
