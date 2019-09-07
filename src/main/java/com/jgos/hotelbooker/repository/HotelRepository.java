package com.jgos.hotelbooker.repository;

import com.jgos.hotelbooker.entity.hotel.Hotel;
import com.jgos.hotelbooker.entity.hotel.data.City;
import com.jgos.hotelbooker.entity.user.UserDb;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public interface HotelRepository extends CrudRepository<Hotel, Long> {

    List<Hotel> findByHotelDetailCity(City city);

    Hotel findByOwner(UserDb user);
}
