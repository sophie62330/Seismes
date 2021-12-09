package com.exoSpring.seismeLocation.repositories;

import com.exoSpring.seismeLocation.entities.Seisme;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SeismeRepository extends MongoRepository<Seisme, String> {
}
