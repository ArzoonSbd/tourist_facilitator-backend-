package com.jgos.hotelbooker.repository;

import com.jgos.hotelbooker.entity.hotel.data.HotelFacilities;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelFacilitiesRepository extends CrudRepository<HotelFacilities, Long> {

}
