package com.jgos.hotelbooker.repository;

import com.jgos.hotelbooker.entity.hotel.Notification;
import com.jgos.hotelbooker.entity.user.UserDb;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NotificationRepository extends CrudRepository<Notification, Long> {

    Notification findByOwner(UserDb owner);
}
