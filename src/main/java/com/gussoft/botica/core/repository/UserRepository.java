package com.gussoft.botica.core.repository;

import com.gussoft.botica.core.models.entity.User;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface UserRepository extends R2dbcRepository<User, Long> {

  Mono<User> findByNameAndPassword(String name, String password);

  Mono<User> findByName(String name);

}
