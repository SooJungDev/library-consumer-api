package com.example.libraryconsumerapi.reserve.service;

import com.example.libraryconsumerapi.reserve.dto.ReserveBookDto;

public interface ReservationService {
   void processReservation(ReserveBookDto bookDto);
}
