package com.jgos.hotelbooker.repository;

import com.jgos.hotelbooker.entity.room.RoomFacilities;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoomFacilitiesRepository extends CrudRepository<RoomFacilities, Long> {

}
