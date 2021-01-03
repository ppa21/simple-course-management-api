package com.javabrains.springbootquickstart.courseapi.services;

import com.javabrains.springbootquickstart.courseapi.models.Course;
import com.javabrains.springbootquickstart.courseapi.repositories.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getCourses(String topicId) {
        List<Course> courses = new ArrayList<>();

        courseRepository.findByTopicId(topicId).forEach(courses::add);

        return courses;
    }

    public Course getCourse(String id) {
        List<Course> courses = (List<Course>) courseRepository.findAll();

        for (Course course : courses) {
            if (course.getId().equals(id)) {
                return course;
            }
        }

        return null;
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}

