package com.javabrains.springbootquickstart.courseapi.repositories;

import com.javabrains.springbootquickstart.courseapi.models.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {
    List<Course> findByTopicId(String topicId);
}
