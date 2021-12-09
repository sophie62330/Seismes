package com.exoSpring.seismeLocation.repositories;

import com.exoSpring.seismeLocation.entities.Localisation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocalisationRepository extends MongoRepository<Localisation, String> {
}
