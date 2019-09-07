package com.jgos.hotelbooker.service;

import com.jgos.hotelbooker.entity.user.Reservation;
import org.springframework.stereotype.Service;


public interface NotificationService {
    void addReservation(Reservation reservation);
    void submitNotification();
}
