package com.jgos.hotelbooker.repository;

import com.jgos.hotelbooker.entity.hotel.data.Rating;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RatingRepository extends CrudRepository<Rating, Long> {

}
