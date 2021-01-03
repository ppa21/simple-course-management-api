package com.javabrains.springbootquickstart.courseapi.repositories;

import com.javabrains.springbootquickstart.courseapi.models.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
}
