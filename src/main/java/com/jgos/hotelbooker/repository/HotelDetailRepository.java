package com.jgos.hotelbooker.repository;

import com.jgos.hotelbooker.entity.hotel.HotelDetail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface HotelDetailRepository extends CrudRepository<HotelDetail, Long> {

}
