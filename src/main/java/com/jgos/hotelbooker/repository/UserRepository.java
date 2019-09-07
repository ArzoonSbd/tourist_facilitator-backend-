package com.jgos.hotelbooker.repository;

import com.jgos.hotelbooker.entity.user.UserDb;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<UserDb, Long> {

    UserDb findByEmail(String email);
}
