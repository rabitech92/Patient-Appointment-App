package com.appoinment.health.repository;

import com.appoinment.health.model.Message;
import com.appoinment.health.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends MongoRepository<Message,Long> {
}
